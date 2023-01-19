package com.brinks.use_cases.create_new_brazilian_company_user_request;

import com.brinks.entities.NewUserRequest;
import com.brinks.use_cases.contracts.FunctionUseCase;

import java.util.UUID;

public interface CreateNewBrazilianCompanyUserRequestUseCase extends FunctionUseCase<NewUserRequest, UUID> {
}
