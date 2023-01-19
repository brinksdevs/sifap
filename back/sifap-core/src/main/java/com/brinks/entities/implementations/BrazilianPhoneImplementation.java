package com.brinks.entities.implementations;

import com.brinks.entities.Phone;

import java.util.Optional;

import static com.brinks.entities.implementations.validation_rules.BrazilianPhoneValidationRule.*;

public class BrazilianPhoneImplementation extends Phone {
    private String DDD;
    private String notDDD;
    private Boolean isDDDExtractionNotExecuted = true;
    private String errorMessageOnPropertiesValidation;

    @Override
    public Boolean hasValidProperties() {
        this.executeDDDExtraction();
        return this.isDDDValid() &&  this.isNotDDDValid();
    }

    private Boolean isDDDValid() {
        return this.isDDDLengthValid() && this.isDDDValueAllowed();
    }

    private Boolean isNotDDDValid() {
        if (this.isMobile)
            return this.isMobileNotDDDPartValid();
        return this.isLandlineNotDDDPartValid();
    }

    private boolean isDDDValueAllowed() {
        return ALLOWED_DDD_VALUES.stream()
                .anyMatch(this::compareCurrentDDDWithAllowedDDD);
    }

    private Boolean isDDDLengthValid() {
        if (this.DDD.length() == ALLOWED_DDD_LENGTH)
            return true;
        this.errorMessageOnPropertiesValidation = "DDD length was bigger than ".concat(ALLOWED_DDD_LENGTH.toString());
        return false;
    }

    private Boolean isMobileNotDDDPartValid() {
        return this.isMobileSizeValid() && this.isMobileFirstDigitValid() && this.isMobileSecondDigitValid();
    }

    private Boolean isLandlineNotDDDPartValid() {
        return this.isLandlineSizeValid() && this.isLandlineSecondDigitValid();
    }

    private boolean isLandlineSecondDigitValid() {
        return ALLOWED_SECOND_LANDLINE_NUMBERS.stream()
                .anyMatch(this::compareCurrentLandlineSecondDigitWithAllowedValue);
    }

    private boolean compareCurrentLandlineSecondDigitWithAllowedValue(String allowedSecondLandlineValue) {
        var notDDDPart = this.notDDD.substring(1,2);
        if (allowedSecondLandlineValue.equals(notDDDPart))
            return true;
        this.errorMessageOnPropertiesValidation = "Landline second digit (".concat(notDDDPart).concat(") not allowed");
        return false;
    }

    private Boolean isLandlineSizeValid() {
        if (ALLOWED_LANDLINE_LENGTH.equals(this.notDDD.length()))
            return true;
        this.errorMessageOnPropertiesValidation = "Landline number (NOT DDD) size was not valid (Should be "
                .concat(ALLOWED_LANDLINE_LENGTH.toString()).concat(")");
        return false;
    }

    private boolean isMobileSecondDigitValid() {
        return ALLOWED_SECOND_CELLPHONE_NUMBERS.stream()
                .anyMatch(this::compareSecondDigitWithAllowedValue);
    }

    private boolean compareSecondDigitWithAllowedValue(String allowedValue) {
        var secondDigitFromNotDDDPart = this.notDDD.substring(1,2);
        if (allowedValue.equals(secondDigitFromNotDDDPart))
            return true;
        this.errorMessageOnPropertiesValidation = "Second digit (".concat(secondDigitFromNotDDDPart).concat(") was not valid");
        return false;
    }

    private boolean isMobileFirstDigitValid() {
        if (this.notDDD.startsWith(ALLOWED_FIRST_CELLPHONE_NUMBER))
            return true;
        this.errorMessageOnPropertiesValidation = "Mobile first digit was not valid. Should start with ".concat(ALLOWED_FIRST_CELLPHONE_NUMBER);
        return false;
    }

    private Boolean isMobileSizeValid() {
        if (this.notDDD.length() == ALLOWED_NUMBER_LENGTH)
            return true;
        this.errorMessageOnPropertiesValidation = "Mobile number (NOT DDD) size was not valid (Should be "
                .concat(ALLOWED_DDD_LENGTH.toString().concat(")"));
        return false;
    }

    private boolean compareCurrentDDDWithAllowedDDD(String allowedValue) {
        if (allowedValue.equals(this.DDD))
            return true;
        this.errorMessageOnPropertiesValidation = "Current DDD value (".concat(this.DDD).concat(") was not allowed");
        return false;
    }

    private void executeDDDExtraction() {
        if (this.isDDDExtractionNotExecuted){
            this.DDD = this.number.substring(0, 2);
            this.notDDD = this.number.substring(2);
            this.isDDDExtractionNotExecuted = false;
        }
    }

    @Override
    public Optional<String> getErrorMessageIfPresent() {
        return Optional.ofNullable(this.errorMessageOnPropertiesValidation);
    }
}
