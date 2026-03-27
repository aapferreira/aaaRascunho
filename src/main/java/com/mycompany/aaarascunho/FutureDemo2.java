package com.mycompany.aaarascunho;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class FutureDemo2 {

    public static void main(String[] args) {

        CompletableFuture<String> future
                = CompletableFuture.supplyAsync(() -> {
                    try {
                        Thread.sleep(10_000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    return "Completed";
                });

        System.out.println("Task submitted...");

        future
                //.orTimeout(3, TimeUnit.SECONDS)
                .thenAccept(result -> {
                    System.out.println("Task completed!");
                    System.out.println(result);
                })
                .exceptionally(ex -> {
                    System.out.println("Error or timeout: " + ex.getMessage());
                    return null;
                });

        System.out.println("Main thread continues...");

        try {
            Thread.sleep(12_000); // apenas para manter a aplicação viva
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
