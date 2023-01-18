package com.brinks.entities;

import com.brinks.entities.contracts.CredentialId;
import com.brinks.entities.contracts.CredentialSecret;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Credential {
    protected CredentialId id;
    protected CredentialSecret secret;
}
