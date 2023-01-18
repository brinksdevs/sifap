package com.brinks.entities;

import com.brinks.entities.contracts.CredentialId;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Email implements CredentialId {
    protected String address;
}
