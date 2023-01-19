package com.brinks.entities.implementations;

import com.brinks.entities.Email;

public class EmailImplementation extends Email {
    @Override
    public String retrieveIdValue() {
        return this.address;
    }

    @Override
    public Boolean hasValidProperties() {
        //TODO: implementar validação propriedades
        return null;
    }
}
