package com.brinks.entities.implementations;

import com.brinks.entities.CPF;
import com.brinks.entities.EmployeeUser;

public class BrazilianEmployeeUserImplementation extends EmployeeUser {

    public BrazilianEmployeeUserImplementation(CPF officialIdentificationCode) {
        super(officialIdentificationCode);
    }

    @Override
    protected boolean officialIdentificationCodeIsValid() {
        var officialIdCode = (CPF) this.officialIdentificationCode;
        if (officialIdCode.hasValidProperties())
            return true;
        this.errorMessageOnPropertiesValidation = "CPF was not valid: "
                .concat(officialIdCode.getErrorMessageIfPresent().orElse("specific CPF error message not available"));
        return false;
    }
}
