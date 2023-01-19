package com.brinks.entities.implementations;

import com.brinks.entities.CPF;

import java.util.Optional;

public class CPFImplementation extends CPF {
    @Override
    public Boolean hasValidProperties() {
        //TODO: implementar validação de propriedades
        return null;
    }

    @Override
    public Optional<String> getErrorMessageIfPresent() {
        return Optional.empty();
    }
}
