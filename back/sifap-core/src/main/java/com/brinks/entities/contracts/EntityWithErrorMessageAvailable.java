package com.brinks.entities.contracts;

import java.util.Optional;

public interface EntityWithErrorMessageAvailable {

    Optional<String> getErrorMessageIfPresent();

}
