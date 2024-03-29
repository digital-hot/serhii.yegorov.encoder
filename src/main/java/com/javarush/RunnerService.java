package com.javarush;

import java.util.Scanner;

class RunnerService {
    CLI cli = new CLI();
    void runWithCommandLine() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter command (ENCRYPT, DECRYPT, BRUTE_FORCE):");
        String command = scanner.nextLine().toUpperCase();

        System.out.println("Enter file path:");
        String filePath = scanner.nextLine();

        int key = 0;
        if (!command.equals("BRUTE_FORCE")) {
            System.out.println("Enter key:");
            key = scanner.nextInt();
        }

        String[] arguments = {command, filePath, String.valueOf(key)};
        cli.processArguments(arguments);
    }


    void runWithArguments(String[] args) {
        cli.processArguments(args);
    }

}
