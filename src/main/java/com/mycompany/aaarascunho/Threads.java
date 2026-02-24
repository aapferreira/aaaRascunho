package com.mycompany.aaarascunho;

public class Threads {

    public static void main(String[] args) {

        int n = 10;
        for (int i = 0; i < 10; i++) {

//            ThreadT1 t1 = new ThreadT1();
//            t1.start();
//
//            Thread t2 = new Thread(new ThreadT2());
//            t2.start();

        }

    }

}

class Thread1 extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("Thread 1 is running");
        } catch (Exception e) {
            System.out.println("Excpetion" + e.getMessage());
        }
    }

}

class Thread2 implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println("Thread 2 is running");
        } catch (Exception e) {
            System.out.println("Excpetion" + e.getMessage());
        }
    }

}
