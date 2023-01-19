package com.brinks.use_cases.create_new_brazilian_employee_user_request.implementations;

import com.brinks.entities.NewUserRequest;
import com.brinks.use_cases.create_new_brazilian_employee_user_request.CreateNewBrazilianEmployeeUserRequestUseCase;
import com.brinks.use_cases.create_new_brazilian_employee_user_request.implementations.exceptions.BrazilianEmployeeUserWithInvalidPropertiesException;
import com.brinks.use_cases.create_new_brazilian_employee_user_request.implementations.secondary_ports.NewBrazilianEmployeeUserRequestStorageSecondaryPort;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor
public class CreateNewBrazilianEmployeeUserRequestUseCaseImplementation implements CreateNewBrazilianEmployeeUserRequestUseCase {

    private final NewBrazilianEmployeeUserRequestStorageSecondaryPort newBrazilianEmployeeUserRequestStorageSecondaryPort;

    @Override
    public UUID execute(NewUserRequest input) {
        if (input.getUser().hasValidProperties())
            return this.newBrazilianEmployeeUserRequestStorageSecondaryPort.plugFunctionalityUsing(input);
        throw new BrazilianEmployeeUserWithInvalidPropertiesException(input.getUser().getErrorMessageIfPresent().orElse("error message was not available"));
    }
}
