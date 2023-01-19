package com.brinks.entities.factories.implementations;

import com.brinks.entities.NewUserRequest;
import com.brinks.entities.factories.NewUserRequestsFactory;
import com.brinks.entities.implementations.NewUserRequestImplementation;

public class NewUserRequestsFactoryImplementation implements NewUserRequestsFactory {
    @Override
    public NewUserRequest makeInstance() {
        return new NewUserRequestImplementation();
    }
}
