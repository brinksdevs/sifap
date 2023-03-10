package com.brinks.use_cases.create_new_brazilian_employee_user_request.factories.implementations;

import com.brinks.use_cases.create_new_brazilian_employee_user_request.CreateNewBrazilianEmployeeUserRequestUseCase;
import com.brinks.use_cases.create_new_brazilian_employee_user_request.factories.CreateNewBrazilianEmployeeUserRequestUseCaseFactory;
import com.brinks.use_cases.create_new_brazilian_employee_user_request.implementations.CreateNewBrazilianEmployeeUserRequestUseCaseImplementation;
import com.brinks.use_cases.create_new_brazilian_employee_user_request.implementations.secondary_ports.NewBrazilianEmployeeUserRequestStorageSecondaryPort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreateNewBrazilianEmployeeUserRequestUseCaseFactoryImplementation implements CreateNewBrazilianEmployeeUserRequestUseCaseFactory {

    private final NewBrazilianEmployeeUserRequestStorageSecondaryPort newBrazilianEmployeeUserRequestStorageSecondaryPort;

    @Override
    public CreateNewBrazilianEmployeeUserRequestUseCase makeInstance() {
        return new CreateNewBrazilianEmployeeUserRequestUseCaseImplementation(this.newBrazilianEmployeeUserRequestStorageSecondaryPort);
    }
}
