package org.extism.chicory.sdk;


import com.dylibso.chicory.runtime.HostFunction;

import java.nio.charset.StandardCharsets;
import java.nio.file.Path;

/**
 * Extism convenience functions.
 */
public class Extism {


    /**
     * Invokes the named {@code function} from the {@link Manifest} with the given {@code input}.
     * This is a convenience method. Prefer initializing and using a {@link Plugin} where possible.
     *
     * @param manifest the manifest containing the function
     * @param function the name of the function to call
     * @param input    the input as string
     * @return the output as string
     * @throws ExtismException if the call fails
     */
    public static String invokeFunction(Manifest manifest, String function, String input) throws ExtismException {
        try (var plugin = new Plugin(manifest, new HostFunction[0], null)) {
            return new String(plugin.call(function, input.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        }
    }
}
