package com.brinks.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
public abstract class User {
    protected UUID id;
    protected String fullName;
    protected List<Phone> phones;
    protected List<Credential> credentials;
    protected List<AssumedRole> assumedRoles;

}
