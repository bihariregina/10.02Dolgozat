/*
* File: Writable.java
* Author: Bihari Regina
* Copyright: 2026, Bihari Regina
* Group: Szoft II
* Date: 2026-10-02
* Github: 
* Licenc: MIT
*/

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Writer implements Writable {

    @Override
    public void writeContent(String content) {
        try {
            Files.writeString(Path.of("output.txt"), content);
            System.out.println("A fájlba írás sikeres!");
        } catch (IOException e) {
            throw new UncheckedIOException(
                "Hiba történt a fájl írásakor!", e
            );
        }
    }
} 
    

