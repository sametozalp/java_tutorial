package com.ozalp.thread1;

public class Main {
    public static void main(String[] args) {

        Printer printer = new Printer("Printer");
        Printer printer2 = new Printer("Printer2");

        printer.start();
        printer2.start();

        System.out.println("Main thread çalışıyor..");

    }
}
