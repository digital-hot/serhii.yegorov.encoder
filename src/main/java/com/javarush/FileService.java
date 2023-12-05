package com.javarush;

//Клас для читання та запису файлів.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileService {

    public String readLines(String filePath)  {
        try {
            return Files.readString(Path.of(filePath));//Files.readAllLines(Path.of(filePath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeLines(String filePath, List<String> lines) {
        try {
            Files.write(Path.of(filePath), lines, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
