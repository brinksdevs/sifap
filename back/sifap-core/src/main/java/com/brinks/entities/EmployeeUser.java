package com.brinks.entities;

import com.brinks.entities.contracts.OfficialIdentificationCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public abstract class EmployeeUser extends User{

    protected List<AssumedRole> assumedRoles;
    protected EmployeeUser(OfficialIdentificationCode officialIdentificationCode) {
        super(officialIdentificationCode);
    }
}
