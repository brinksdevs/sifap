package com.brinks.use_cases.create_new_brazilian_employee_user_request.implementations.secondary_ports;

import com.brinks.entities.NewUserRequest;
import com.brinks.use_cases.contracts.FunctionSecondaryPort;

import java.util.UUID;

public interface NewBrazilianEmployeeUserRequestStorageSecondaryPort extends FunctionSecondaryPort<NewUserRequest, UUID> {
}
