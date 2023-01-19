package com.brinks.entities.implementations;

import com.brinks.entities.Phone;

import static com.brinks.entities.implementations.validation_rules.BrazilianPhoneValidationRule.*;

public class BrazilianPhoneImplementation extends Phone {
    private String DDD;
    private String notDDD;
    private Boolean isDDDExtractionNotExecuted = true;

    @Override
    public Boolean hasValidProperties() {
        this.executeDDDExtraction();
        return this.isDDDValid() &&  this.isNotDDDValid();
    }

    private Boolean isNotDDDValid() {
        if (this.isMobile)
            return this.isMobileNotDDDPartValid();
        return this.isLandlineNotDDDPartValid();
    }

    private Boolean isLandlineNotDDDPartValid() {
        return this.isLandlineSizeValid() && this.isLandlineSecondDigitValid();
    }

    private boolean isLandlineSecondDigitValid() {
        return ALLOWED_SECOND_LANDLINE_NUMBERS.stream()
                .anyMatch(allowedSecondLandline -> allowedSecondLandline.equals(this.notDDD.substring(1,2)));
    }

    private Boolean isLandlineSizeValid() {
        return ALLOWED_LANDLINE_LENGTH.equals(this.notDDD.length());
    }

    private Boolean isMobileNotDDDPartValid() {
        return this.isMobileSizeValid() && this.isMobileFirstDigitValid() && this.isMobileSecondDigitValid();
    }

    private boolean isMobileSecondDigitValid() {
        return ALLOWED_SECOND_CELLPHONE_NUMBERS.stream()
                .anyMatch(allowedSecondNumber -> allowedSecondNumber.equals(this.notDDD.substring(1,2)));
    }

    private boolean isMobileFirstDigitValid() {
        return this.notDDD.startsWith(ALLOWED_FIRST_CELLPHONE_NUMBER);
    }

    private Boolean isMobileSizeValid() {
        return this.notDDD.length() == ALLOWED_NUMBER_LENGTH;
    }

    private boolean isDDDValueAllowed() {
        return ALLOWED_DDD_VALUES.stream()
                .anyMatch(allowedValue -> allowedValue.equals(this.DDD));
    }

    private Boolean isDDDLengthValid() {
        return this.DDD.length() == ALLOWED_DDD_LENGTH;
    }

    private Boolean isDDDValid() {
        return this.isDDDLengthValid() && this.isDDDValueAllowed();
    }

    private void executeDDDExtraction() {
        if (this.isDDDExtractionNotExecuted){
            this.DDD = this.number.substring(0, 2);
            this.notDDD = this.number.substring(2);
            this.isDDDExtractionNotExecuted = false;
        }
    }
}
