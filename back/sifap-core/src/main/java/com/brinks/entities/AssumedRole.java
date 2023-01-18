package com.brinks.entities;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public abstract class AssumedRole {
    protected Long id;
    protected Role role;
    protected LocalDate startDate;
    protected LocalDate endDate;
}
