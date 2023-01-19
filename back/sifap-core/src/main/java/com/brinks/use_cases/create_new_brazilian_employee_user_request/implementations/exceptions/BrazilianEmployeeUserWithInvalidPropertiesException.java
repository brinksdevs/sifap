package com.brinks.use_cases.create_new_brazilian_employee_user_request.implementations.exceptions;

public class BrazilianEmployeeUserWithInvalidPropertiesException extends RuntimeException {
    public BrazilianEmployeeUserWithInvalidPropertiesException(String errorMessage) {
        super("The brazilian employee user had some problem during its properties validation: ".concat(errorMessage));
    }
}
