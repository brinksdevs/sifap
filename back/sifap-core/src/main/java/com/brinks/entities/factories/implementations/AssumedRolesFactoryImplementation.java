package com.brinks.entities.factories.implementations;

import com.brinks.entities.AssumedRole;
import com.brinks.entities.factories.AssumedRolesFactory;
import com.brinks.entities.implementations.AssumedRoleImplementation;

public class AssumedRolesFactoryImplementation implements AssumedRolesFactory {
    @Override
    public AssumedRole makeInstance() {
        return new AssumedRoleImplementation();
    }
}
