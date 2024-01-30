package com.javarush;

class Runner {
    static final int ARGUMENTS_SIZE = 3;
    public static void main(String[] args) {
        RunnerService runnerService = new RunnerService();
        if (args.length == ARGUMENTS_SIZE) {
            runnerService.runWithArguments(args);
        } else {
            runnerService.runWithCommandLine();
        }
    }
}
