package com.brinks.entities.contracts;

public interface CredentialId extends EntityWithPropertyValidation, EntityWithErrorMessageAvailable{

    String retrieveIdValue();
}
