package com.brinks.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class ServiceContract {

    protected Long id;
    protected String name;
    protected String description;
    //TODO: mapear quais campos a mais um service contract pode ter

}
