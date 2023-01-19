package com.brinks.entities;

import com.brinks.entities.contracts.EntityWithPropertyValidation;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Phone implements EntityWithPropertyValidation {
    protected String number ;
    protected Boolean isMobile;

}
