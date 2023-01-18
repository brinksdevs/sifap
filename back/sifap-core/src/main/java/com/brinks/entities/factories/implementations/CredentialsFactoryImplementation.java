package com.brinks.entities.factories.implementations;

import com.brinks.entities.Credential;
import com.brinks.entities.factories.CredentialsFactory;
import com.brinks.entities.implementations.CredentialImplementation;

public class CredentialsFactoryImplementation implements CredentialsFactory
{
    @Override
    public Credential makeInstance() {
        return new CredentialImplementation();
    }
}
