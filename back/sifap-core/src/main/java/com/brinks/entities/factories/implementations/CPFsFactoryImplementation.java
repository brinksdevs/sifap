package com.brinks.entities.factories.implementations;

import com.brinks.entities.CPF;
import com.brinks.entities.factories.CPFsFactory;
import com.brinks.entities.implementations.CPFImplementation;

public class CPFsFactoryImplementation implements CPFsFactory {
    @Override
    public CPF makeInstance() {
        return new CPFImplementation();
    }
}
