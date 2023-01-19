package com.brinks.entities.implementations;

import com.brinks.entities.SimplePassword;

public class SimplePasswordImplementation extends SimplePassword {
    @Override
    public String retrieveEncryptedValue() {
        //TODO: implementar criptografia na obtenção da senha;
        return null;
    }

    @Override
    public Boolean hasValidProperties() {
        //TODO: implementar validação de propriedades
        return null;
    }
}
