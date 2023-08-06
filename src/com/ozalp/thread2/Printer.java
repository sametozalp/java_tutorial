package com.ozalp.thread2;

// Burada Runnable'dan implement ediyoruz.

public class Printer implements Runnable {

    private String isim;

    public Printer(String isim) {
        this.isim = isim;
    }

    @Override
    public void run() {
        System.out.println(isim + " çalışıyor..");

        for (int i = 0; i < 10; i++) {
            System.out.println(isim + " yazıyor: " + (i + 1));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(isim + " işini bitirdi.");

    }

}
