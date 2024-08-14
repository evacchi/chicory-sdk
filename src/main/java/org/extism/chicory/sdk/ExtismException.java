package org.extism.chicory.sdk;

import java.io.IOException;

public class ExtismException extends RuntimeException {

    public ExtismException(String message) {
        super(message);
    }

    public ExtismException(Throwable cause) {
        super(cause);
    }

    public ExtismException(String message, Throwable cause) {
        super(message, cause);
    }
}
