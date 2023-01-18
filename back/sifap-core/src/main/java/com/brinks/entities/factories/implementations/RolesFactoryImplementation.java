package com.brinks.entities.factories.implementations;

import com.brinks.entities.Role;
import com.brinks.entities.factories.RolesFactory;
import com.brinks.entities.implementations.RoleImplementation;

public class RolesFactoryImplementation implements RolesFactory {
    @Override
    public Role makeInstance() {
        return new RoleImplementation();
    }
}
