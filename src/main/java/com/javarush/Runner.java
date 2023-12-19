package com.javarush;

class Runner {
    static final int MAGIC_NUMBER = 3;
    public static void main(String[] args) {
        RunnerService runnerService = new RunnerService();
        if (args.length == MAGIC_NUMBER) {
            runnerService.runWithArguments(args);
        } else {
            runnerService.runWithCommandLine();
        }
    }
}
