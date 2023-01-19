package com.brinks.entities;

import com.brinks.entities.contracts.EntityWithErrorMessageAvailable;
import com.brinks.entities.contracts.EntityWithPropertyValidation;
import com.brinks.entities.contracts.OfficialIdentificationCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Getter
@Setter
@RequiredArgsConstructor
public abstract class User implements EntityWithPropertyValidation, EntityWithErrorMessageAvailable {

    protected UUID id;
    protected final OfficialIdentificationCode officialIdentificationCode;
    protected String fullName;
    protected List<Phone> phones;
    protected Credential credential;
    protected String errorMessageOnPropertiesValidation;

    @Override
    public Boolean hasValidProperties(){
        return this.isCredentialValid()
                && this.phonesAreValid()
                && this.officialIdentificationCodeIsValid();
    }

    protected abstract boolean officialIdentificationCodeIsValid();

    private boolean phonesAreValid() {
        return this.phones.stream().allMatch(this::checkOnPhoneValidation);
    }

    private boolean checkOnPhoneValidation(Phone phone) {
        if (phone.hasValidProperties())
            return true;
        this.errorMessageOnPropertiesValidation = "Phone Validation Error: "
                .concat(phone.getErrorMessageIfPresent().orElse("phone specific error message not available"));
        return false;
    }

    private Boolean isCredentialValid() {
        if (this.credential.hasValidProperties())
            return true;
        this.errorMessageOnPropertiesValidation = "Credential Validation Error: "
                .concat(this.credential.getErrorMessageIfPresent().orElse("credential specific error message not available"));
        return false;
    }

    @Override
    public Optional<String> getErrorMessageIfPresent(){
        return Optional.ofNullable(this.errorMessageOnPropertiesValidation);
    }

}
