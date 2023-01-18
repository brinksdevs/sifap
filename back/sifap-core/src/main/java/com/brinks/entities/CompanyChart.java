package com.brinks.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public abstract class CompanyChart {
    protected List<Level> rootLevels;
}
