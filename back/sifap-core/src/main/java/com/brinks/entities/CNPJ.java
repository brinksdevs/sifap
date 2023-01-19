package com.brinks.entities;

import com.brinks.entities.contracts.EntityWithErrorMessageAvailable;
import com.brinks.entities.contracts.EntityWithPropertyValidation;
import com.brinks.entities.contracts.OfficialIdentificationCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class CNPJ implements EntityWithPropertyValidation, OfficialIdentificationCode, EntityWithErrorMessageAvailable {

    protected String code;

}
