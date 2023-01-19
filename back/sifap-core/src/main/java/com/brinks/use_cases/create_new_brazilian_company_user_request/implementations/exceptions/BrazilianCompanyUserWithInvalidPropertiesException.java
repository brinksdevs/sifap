package com.brinks.use_cases.create_new_brazilian_company_user_request.implementations.exceptions;

public class BrazilianCompanyUserWithInvalidPropertiesException extends RuntimeException {
    public BrazilianCompanyUserWithInvalidPropertiesException(String errorMessage) {
        super("Brazilian company user had some problems during its properties validation: ".concat(errorMessage));
    }
}
