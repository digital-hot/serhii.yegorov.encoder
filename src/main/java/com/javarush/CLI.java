package com.javarush;

//Клас для взаємодії з користувачем через командний рядок.

class CLI {
    CaesarCipher caesarCipher = new CaesarCipher();
    void processArguments(String[] args) {
        String command = args[0].toUpperCase();
        String filePath = args[1];
        int key = Integer.parseInt(args[2]);

        switch (command) {
            case "ENCRYPT" -> encryptFile(filePath, key);
            case "DECRYPT" -> decryptFile(filePath, key);
            case "BRUTE_FORCE" -> bruteForceDecrypt(filePath);
            default -> System.out.println("Invalid command. Please use ENCRYPT, DECRYPT, or BRUTE_FORCE.");
        }
    }
    void encryptFile(String filePath, int key) {
        // Додайте код для шифрування файлу з вказаним ключем
        FileService fileService = new FileService();
        String listSt = fileService.readString(filePath);
        String encrypt = caesarCipher.encrypt(listSt, key);

        fileService.writeLines(filePath+"ENCRYPT", encrypt);
        System.out.println("Encrypting file: " + filePath + " with key: " + key);
    }

    void decryptFile(String filePath, int key) {
        // Додайте код для розшифрування файлу з вказаним ключем
        FileService fileService = new FileService();
        String listSt = fileService.readString(filePath);
        String encrypt = caesarCipher.decrypt(listSt, key);

        fileService.writeLines(filePath+"DECRYPT", encrypt);
        System.out.println("Decrypting file: " + filePath + " with key: " + key);
    }

    void bruteForceDecrypt(String filePath) {
        //TODO Додайте код для автоматичного підбору ключа та розшифрування файлу
        System.out.println("Brute-force decrypting file: " + filePath);
    }

}
