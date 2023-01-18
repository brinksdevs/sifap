package com.brinks.entities.factories.implementations;

import com.brinks.entities.Phone;
import com.brinks.entities.factories.BrazilianPhonesFactory;
import com.brinks.entities.implementations.BrazilianPhoneImplementation;

public class BrazilianPhonesFactoryImplementation implements BrazilianPhonesFactory
{
    @Override
    public Phone makeInstance() {
        return new BrazilianPhoneImplementation()        ;
    }
}
