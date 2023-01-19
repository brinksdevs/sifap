package com.brinks.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public abstract class NewUserRequest {
    protected UUID id;
    protected User user;
}
