package com.brinks.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public abstract class Role {
    protected Long id;
    protected String name;
    protected List<Benefit> benefits;
    protected Double workHourEarningValue;
    protected Integer workload;

}
