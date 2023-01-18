package com.brinks.entities.factories.implementations;

import com.brinks.entities.User;
import com.brinks.entities.factories.UsersFactory;
import com.brinks.entities.implementations.UserImplementation;

public class UsersFactoryImplementation implements UsersFactory
{
    @Override
    public User makeInstance() {
        return new UserImplementation();
    }
}
