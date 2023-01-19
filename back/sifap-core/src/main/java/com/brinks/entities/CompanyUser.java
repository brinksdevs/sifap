package com.brinks.entities;

import com.brinks.entities.contracts.OfficialIdentificationCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public abstract class CompanyUser extends User {

    protected List<ServiceContract> serviceContracts;

    protected CompanyUser(OfficialIdentificationCode officialIdentificationCode) {
        super(officialIdentificationCode);
    }
}
