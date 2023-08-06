package com.ozalp.thread2;

import com.ozalp.thread1.Printer;

public class Main {
    public static void main(String[] args) {

        Thread printer = new Thread(new Printer("Printer"));
        Thread printer2 = new Thread(new Printer("Printer2"));

        printer.start();
        printer2.start();

        System.out.println("Main thread çalışıyor..");

    }
}
