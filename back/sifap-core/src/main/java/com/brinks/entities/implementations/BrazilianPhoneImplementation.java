package com.brinks.entities.implementations;

import com.brinks.entities.Phone;

import static com.brinks.entities.implementations.validation_rules.BrazilianPhoneValidationRule.ALLOWED_DDD_LENGTH;
import static com.brinks.entities.implementations.validation_rules.BrazilianPhoneValidationRule.ALLOWED_DDD_VALUES;

public class BrazilianPhoneImplementation extends Phone {
    private String DDD;
    private String notDDD;
    private Boolean isDDDExtractionNotExecuted = true;

    @Override
    public Boolean hasValidProperties() {
        this.executeDDDExtraction();
        return this.isDDDValid() && this.isNotDDDValid();
    }

    private Boolean isNotDDDValid() {
        return this.isDDDLengthValid() && this.isDDDValueAllowed();
    }

    private boolean isDDDValueAllowed() {
        return ALLOWED_DDD_VALUES.stream()
                .anyMatch(allowedValue -> allowedValue.equals(this.DDD));
    }

    private Boolean isDDDLengthValid() {
        return this.DDD.length() == ALLOWED_DDD_LENGTH;
    }

    private Boolean isDDDValid() {
        //todo:implementar validação do DDD
        return false;
    }

    private void executeDDDExtraction() {
        if (this.isDDDExtractionNotExecuted){
            this.DDD = this.number.substring(0, 2);
            this.notDDD = this.number.substring(2);
            this.isDDDExtractionNotExecuted = false;
        }
    }
}
