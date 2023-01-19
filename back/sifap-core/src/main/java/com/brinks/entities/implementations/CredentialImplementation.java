package com.brinks.entities.implementations;

import com.brinks.entities.Credential;
import com.brinks.entities.contracts.CredentialId;
import com.brinks.entities.contracts.EntityWithErrorMessageAvailable;

import java.util.Optional;

public class CredentialImplementation extends Credential {

    private String errorMessageOnPropertiesValidation;

    @Override
    public Boolean hasValidProperties() {
        return this.allCredentialIdsAreValid()
                && this.secretIsValid();
    }

    private boolean secretIsValid() {
        if (this.secret.hasValidProperties())
            return true;
        this.setErrorMessageFrom(this.secret);
        return false;
    }

    private Boolean allCredentialIdsAreValid() {
        return this.credentialIds.stream()
                .allMatch(this::credentialIdIsValid);
    }

    private boolean credentialIdIsValid(CredentialId credentialId) {
        if (credentialId.hasValidProperties())
            return true;
        this.setErrorMessageFrom(credentialId);
        return false;
    }

    private void setErrorMessageFrom(EntityWithErrorMessageAvailable credentialComponent) {
        this.errorMessageOnPropertiesValidation = "Credential component not valid: "
                .concat(credentialComponent.getErrorMessageIfPresent().orElse("specific error validation message not present"));
    }

    @Override
    public Optional<String> getErrorMessageIfPresent() {
        return Optional.of(this.errorMessageOnPropertiesValidation);
    }
}
