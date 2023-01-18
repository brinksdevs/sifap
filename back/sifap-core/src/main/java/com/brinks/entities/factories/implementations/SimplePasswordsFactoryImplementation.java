package com.brinks.entities.factories.implementations;

import com.brinks.entities.SimplePassword;
import com.brinks.entities.factories.SimplePasswordsFactory;
import com.brinks.entities.implementations.SimplePasswordImplementation;

public class SimplePasswordsFactoryImplementation implements SimplePasswordsFactory
{
    @Override
    public SimplePassword makeInstance() {
        return new SimplePasswordImplementation();
    }
}
