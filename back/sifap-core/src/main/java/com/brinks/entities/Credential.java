package com.brinks.entities;

import com.brinks.entities.contracts.CredentialId;
import com.brinks.entities.contracts.CredentialSecret;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public abstract class Credential {
    protected Long id;
    protected List<CredentialId> credentialIds;
    protected CredentialSecret secret;
}
