package com.brinks.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Phone {
    protected String number ;
    protected Boolean isMobile;
}
