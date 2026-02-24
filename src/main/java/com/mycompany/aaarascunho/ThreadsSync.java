package com.mycompany.aaarascunho;

public class ThreadsSync {

    public static void main(String[] args) {

        MathUtils m = new MathUtils();

//        Thread1 t1 = new Thread1(m);
//        Thread t2 = new Thread(new Thread2(m));
//        t1.start();
//        t2.start();
        ThreadT1 t1Sync = new ThreadT1(m);
        Thread t2Sync = new Thread(new ThreadT2(m));
        t1Sync.start();
        t2Sync.start();

    }

}

class MathUtils {

//    void getMultiples(int n) {
//        for (int i = 1; i < 5; i++) {
//            System.out.println(n * i);
//            try {
//                Thread.sleep(400);
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//        }
//    }
//    synchronized void getMultiplesSync(int n) {
//        for (int i = 1; i < 5; i++) {
//            System.out.println(n * i);
//            try {
//                Thread.sleep(400);
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//        }
//    }
    void getMultiplesSync(int n) {

        System.out.println("fasdfdas");

        for (int i = 1; i < 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        synchronized (this) {
            for (int i = 1; i < 5; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }

    }

}

class ThreadT1 extends Thread {

    MathUtils mu;

    ThreadT1(MathUtils mu) {
        this.mu = mu;
    }

    @Override
    public void run() {
        try {
            mu.getMultiplesSync(7);
        } catch (Exception e) {
            System.out.println("Excpetion" + e.getMessage());
        }
    }

}

class ThreadT2 implements Runnable {

    MathUtils mu;

    ThreadT2(MathUtils mu) {
        this.mu = mu;
    }

    @Override
    public void run() {
        try {
            mu.getMultiplesSync(5);
        } catch (Exception e) {
            System.out.println("Excpetion" + e.getMessage());
        }
    }

}
