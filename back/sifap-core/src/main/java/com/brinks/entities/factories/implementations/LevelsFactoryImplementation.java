package com.brinks.entities.factories.implementations;

import com.brinks.entities.Level;
import com.brinks.entities.factories.LevelsFactory;
import com.brinks.entities.implementations.LevelImplementation;

public class LevelsFactoryImplementation implements LevelsFactory
{
    @Override
    public Level makeInstance() {
        return new LevelImplementation();
    }
}
