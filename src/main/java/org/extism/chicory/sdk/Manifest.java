package org.extism.chicory.sdk;

import java.nio.file.Path;

class ManifestWasm {
}

class ManifestWasmFile extends ManifestWasm {
    final Path filePath;

    public ManifestWasmFile(Path path) {
        this.filePath = path;
    }
}

class ManifestWasmPath extends ManifestWasm {
    final String path;

    public ManifestWasmPath(String path) {
        this.path = path;
    }
}

class ManifestWasmUrl extends ManifestWasm {
    final String url;

    public ManifestWasmUrl(String url) {
        this.url = url;
    }
}

class ManifestWasmByteArray extends ManifestWasm {
    final String name;
    final byte[] bytes;

    public ManifestWasmByteArray(String name, byte[] bytes) {
        this.name = name;
        this.bytes = bytes;
    }
}

public class Manifest {
    final ManifestWasm[] wasms;

    public static Manifest fromPath(String path) {
        var wasm = new ManifestWasmPath(path);
        return new Manifest(new ManifestWasm[]{wasm});
    }

    public static Manifest fromUrl(String url) {
        var wasm = new ManifestWasmUrl(url);
        return new Manifest(new ManifestWasm[]{wasm});
    }

    public static Manifest fromFilePath(Path path) {
        var wasm = new ManifestWasmFile(path);
        return new Manifest(new ManifestWasm[]{wasm});
    }

    public static Manifest fromBytes(String name, byte[] bytes) {
        var wasm = new ManifestWasmByteArray(name, bytes);
        return new Manifest(new ManifestWasm[]{wasm});
    }


    Manifest(ManifestWasm[] wasms) {
        this.wasms = wasms;
    }
}
