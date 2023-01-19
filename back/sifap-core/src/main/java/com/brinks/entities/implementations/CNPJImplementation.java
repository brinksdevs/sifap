package com.brinks.entities.implementations;

import com.brinks.entities.CNPJ;

import java.util.Optional;

public class CNPJImplementation extends CNPJ {

    private String errorMessageOnPropertiesValidation;

    @Override
    public Boolean hasValidProperties() {
        //TODO: implementar validação de propriedades. Se for true, retorna true. Se for false, antes de retornar false setta mensagem de erro.
        return null;
    }

    @Override
    public Optional<String> getErrorMessageIfPresent() {
        return Optional.ofNullable(this.errorMessageOnPropertiesValidation);
    }
}
