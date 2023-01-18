package com.brinks.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public abstract class Level {
    protected Long id;
    protected Level levelAbove;
    protected List<Level> levelsBelow;
    protected Role role;
    protected Integer availableOpportunities;
}
