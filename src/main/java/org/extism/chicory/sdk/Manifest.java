package org.extism.chicory.sdk;

import org.extism.chicory.sdk.wasm.PathWasmSource;
import org.extism.chicory.sdk.wasm.WasmSource;

import java.nio.file.Path;
import java.util.List;
import java.util.Map;

public class Manifest {
    final List<? extends WasmSource> wasms;

    Manifest(List<? extends WasmSource> wasms) {
        this.wasms = wasms;
    }

    Manifest(WasmSource wasms) {
        this.wasms = List.of(wasms);
    }

    Manifest(List<? extends WasmSource> wasms, MemoryOptions memoryOptions) {
        this.wasms = wasms;
    }

    Manifest(List<? extends WasmSource> wasms, MemoryOptions memoryOptions, Map<String, String> config) {
        this.wasms = wasms;
    }

}
