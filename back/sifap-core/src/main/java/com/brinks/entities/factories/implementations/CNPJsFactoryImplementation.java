package com.brinks.entities.factories.implementations;

import com.brinks.entities.CNPJ;
import com.brinks.entities.factories.CNPJsFactory;
import com.brinks.entities.implementations.CNPJImplementation;

public class CNPJsFactoryImplementation implements CNPJsFactory {
    @Override
    public CNPJ makeInstance() {
        return new CNPJImplementation();
    }
}
