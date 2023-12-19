package com.javarush;

import java.util.Scanner;

class Runner {
    private static int MAGIC_NUMBER = 3;
    public static void main(String[] args) {
        RunnerService runnerService = new RunnerService();
        if (args.length == MAGIC_NUMBER) {
            runnerService.runWithArguments(args);
        } else {
            runnerService.runWithCommandLine();
        }
    }
}
