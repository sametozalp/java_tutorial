package com.ozalp.thread3;

public class Main {
    public static void main(String[] args) {

        Thread printer = new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("Thread1 çalışıyor.");
                for (int i = 0; i < 10; i++) {
                    System.out.println("Yazıyor: " + (i + 1));
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        });

        printer.start();

        new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("Thread2 çalışıyor.");
                for (int i = 0; i < 10; i++) {
                    System.out.println("Yazıyor: " + (i + 1));
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        }).start();

        System.out.println("Main thread çalışıyor..");

    }
}
