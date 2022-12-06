package org.sid.storageservice.util;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.atomic.AtomicReference;

public class FileDownloadUtil {
    private Path foundFile;
    public Resource getFileAsResource(String fileCode) throws IOException {
        Path dirPath = Paths.get("Files-Upload");

        AtomicReference<Path> foundFile = new AtomicReference<>();
        Files.list(dirPath).forEach(file -> {
            if (file.getFileName().toString().startsWith(fileCode)) {
                foundFile.set(file);
                return;
            }
        });

        if (foundFile.get() != null) {
            return new UrlResource(foundFile.get().toUri());
        }

        return null;
    }
}
