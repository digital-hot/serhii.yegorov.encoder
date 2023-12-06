package com.javarush;

//Клас для шифрування та розшифрування тексту за допомогою шифру Цезаря.
public class CaesarCipher {

    private static final int ALPHABET_SIZE = 26;

    public static String encrypt(String text, int key) {
        StringBuilder encryptedText = new StringBuilder();

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char shiftedChar = shiftLetter(c, key);
                encryptedText.append(shiftedChar);
            } else {
                encryptedText.append(c);
            }
        }

        return encryptedText.toString();
    }

    public static String decrypt(String encryptedText, int key) {
        return encrypt(encryptedText, -key);
    }

    private static char shiftLetter(char line, int key) {
        char base = Character.isUpperCase(line) ? 'A' : 'a';
        return (char) ((line - base + key + ALPHABET_SIZE) % ALPHABET_SIZE + base);
    }

}
