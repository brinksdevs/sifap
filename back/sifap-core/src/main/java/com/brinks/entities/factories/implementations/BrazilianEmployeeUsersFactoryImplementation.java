package com.brinks.entities.factories.implementations;

import com.brinks.entities.User;
import com.brinks.entities.factories.BrazilianEmployeeUsersFactory;
import com.brinks.entities.factories.CPFsFactory;
import com.brinks.entities.implementations.BrazilianEmployeeUserImplementation;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BrazilianEmployeeUsersFactoryImplementation implements BrazilianEmployeeUsersFactory {

    private final CPFsFactory cpfsFactory;

    @Override
    public User makeInstance() {
        return new BrazilianEmployeeUserImplementation(this.cpfsFactory.makeInstance());
    }
}
