package com.brinks.entities;

import com.brinks.entities.contracts.CredentialId;
import com.brinks.entities.contracts.CredentialSecret;
import com.brinks.entities.contracts.EntityWithErrorMessageAvailable;
import com.brinks.entities.contracts.EntityWithPropertyValidation;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public abstract class Credential implements EntityWithPropertyValidation, EntityWithErrorMessageAvailable {
    protected Long id;
    protected List<CredentialId> credentialIds;
    protected CredentialSecret secret;
}
