package com.brinks.entities.contracts;

public interface EntityFactory<E>{
    E makeInstance();
}
