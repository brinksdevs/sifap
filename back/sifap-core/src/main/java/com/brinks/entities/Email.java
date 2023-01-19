package com.brinks.entities;

import com.brinks.entities.contracts.CredentialId;
import com.brinks.entities.contracts.EntityWithPropertyValidation;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Email implements CredentialId, EntityWithPropertyValidation {
    protected String address;
}
