package com.brinks.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Benefit {
    protected Long id;
    protected String name;
    protected String description;
}
