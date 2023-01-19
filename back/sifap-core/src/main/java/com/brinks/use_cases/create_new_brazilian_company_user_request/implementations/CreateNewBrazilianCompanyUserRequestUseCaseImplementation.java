package com.brinks.use_cases.create_new_brazilian_company_user_request.implementations;

import com.brinks.entities.NewUserRequest;
import com.brinks.use_cases.create_new_brazilian_company_user_request.CreateNewBrazilianCompanyUserRequestUseCase;
import com.brinks.use_cases.create_new_brazilian_company_user_request.implementations.exceptions.BrazilianCompanyUserWithInvalidPropertiesException;
import com.brinks.use_cases.create_new_brazilian_company_user_request.implementations.secondary_ports.NewBrazilianCompanyUserRequestStorageSecondaryPort;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor
public class CreateNewBrazilianCompanyUserRequestUseCaseImplementation implements CreateNewBrazilianCompanyUserRequestUseCase {

    private final NewBrazilianCompanyUserRequestStorageSecondaryPort newBrazilianCompanyUserRequestStorageSecondaryPort;

    @Override
    public UUID execute(NewUserRequest input) {
        if (input.getUser().hasValidProperties())
            return this.newBrazilianCompanyUserRequestStorageSecondaryPort.plugFunctionalityUsing(input);
        throw new BrazilianCompanyUserWithInvalidPropertiesException(input.getUser().getErrorMessageIfPresent().orElse("error message was not available"));
    }
}
