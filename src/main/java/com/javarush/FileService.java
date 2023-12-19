package com.javarush;

//Клас для читання та запису файлів.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

class FileService {

    String readString(String filePath)  {
        try {
            return Files.readString(Path.of(filePath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    void writeLines(String filePath, String lines) {
        try {
            Files.writeString(Path.of(filePath), lines, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
