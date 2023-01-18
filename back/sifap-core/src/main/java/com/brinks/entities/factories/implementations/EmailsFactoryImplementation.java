package com.brinks.entities.factories.implementations;

import com.brinks.entities.Email;
import com.brinks.entities.factories.EmailsFactory;
import com.brinks.entities.implementations.EmailImplementation;

public class EmailsFactoryImplementation implements EmailsFactory
{
    @Override
    public Email makeInstance() {
        return new EmailImplementation();
    }
}
