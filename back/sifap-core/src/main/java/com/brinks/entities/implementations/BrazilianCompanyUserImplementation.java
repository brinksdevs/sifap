package com.brinks.entities.implementations;

import com.brinks.entities.CNPJ;
import com.brinks.entities.CompanyUser;

public class BrazilianCompanyUserImplementation extends CompanyUser {

    public BrazilianCompanyUserImplementation(CNPJ officialIdentificationCode) {
        super(officialIdentificationCode);
    }

    @Override
    protected boolean officialIdentificationCodeIsValid() {
        var officialIdCode = (CNPJ) this.officialIdentificationCode;
        if (officialIdCode.hasValidProperties())
            return true;
        this.errorMessageOnPropertiesValidation = "CNPJ was not valid: "
                .concat(officialIdCode.getErrorMessageIfPresent().orElse("specific CNPJ error message not available"));
        return false;
    }
}
