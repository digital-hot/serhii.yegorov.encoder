package com.javarush;

//Клас для взаємодії з користувачем через командний рядок.
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CLI {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Caesar Cipher Program!");

        if (args.length == 3) {
            processArguments(args);
        } else {
            displayUsage();
        }
    }

    public static void processArguments(String[] args) {
        String command = args[0].toUpperCase();
        String filePath = args[1];
        int key = Integer.parseInt(args[2]);

        switch (command) {
            case "ENCRYPT":
                encryptFile(filePath, key);
                break;
            case "DECRYPT":
                decryptFile(filePath, key);
                break;
            case "BRUTE_FORCE":
                bruteForceDecrypt(filePath);
                break;
            default:
                System.out.println("Invalid command. Please use ENCRYPT, DECRYPT, or BRUTE_FORCE.");
        }
    }

    private static void encryptFile(String filePath, int key) {
        // Додайте код для шифрування файлу з вказаним ключем
        FileService fileService = new FileService();
        String listSt = fileService.readLines(filePath);
        String encrypt = CaesarCipher.encrypt(listSt, key);

        fileService.writeLines(filePath+"ENCRYPT", Collections.singletonList(encrypt));
        System.out.println("Encrypting file: " + filePath + " with key: " + key);
    }

    private static void decryptFile(String filePath, int key) {
        // Додайте код для розшифрування файлу з вказаним ключем
        FileService fileService = new FileService();
        String listSt = fileService.readLines(filePath);
        String encrypt = CaesarCipher.decrypt(listSt, key);

        fileService.writeLines(filePath+"DECRYPT", Collections.singletonList(encrypt));
        System.out.println("Decrypting file: " + filePath + " with key: " + key);
    }

    private static void bruteForceDecrypt(String filePath) {
        // Додайте код для автоматичного підбору ключа та розшифрування файлу
        System.out.println("Brute-force decrypting file: " + filePath);
    }

    private static void displayUsage() {
        System.out.println("Usage: java -jar myApp.jar command filePath key");
        System.out.println("Commands: ENCRYPT, DECRYPT, BRUTE_FORCE");
    }
}
