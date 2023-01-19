package com.brinks.entities;

import com.brinks.entities.contracts.CredentialSecret;
import com.brinks.entities.contracts.EntityWithPropertyValidation;
import lombok.Setter;

@Setter
public abstract class SimplePassword implements CredentialSecret, EntityWithPropertyValidation {
    protected String value;
    protected byte[] salt;
}
