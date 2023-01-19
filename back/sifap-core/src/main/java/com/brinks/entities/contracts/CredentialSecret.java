package com.brinks.entities.contracts;

public interface CredentialSecret extends EntityWithPropertyValidation, EntityWithErrorMessageAvailable {
    String retrieveEncryptedValue();
}
