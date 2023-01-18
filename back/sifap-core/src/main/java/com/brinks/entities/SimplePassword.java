package com.brinks.entities;

import com.brinks.entities.contracts.CredentialSecret;
import lombok.Getter;
import lombok.Setter;

@Setter
public abstract class SimplePassword implements CredentialSecret {
    protected String value;
    protected byte[] salt;
}
