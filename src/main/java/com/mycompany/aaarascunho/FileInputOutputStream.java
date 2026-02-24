package com.mycompany.aaarascunho;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileInputOutputStream {

    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStram = null;

        fileInputStream = new FileInputStream("src/main/java/com/mycompany/aaarascunho/sourceByte.txt");
        fileOutputStram = new FileOutputStream("src/main/java/com/mycompany/aaarascunho/destByte.txt");

        try {
            //reads a byte at a time, if it reached the end of the fiel, returns -1
            int content;
            while ((content = fileInputStream.read()) != -1) {
                fileOutputStram.write((byte) content);
            }
        } finally {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            if (fileOutputStram != null) {
                fileOutputStram.close();
            }
        }
        
        FileReader fileReader = null;
        FileWriter fileWriter = null;

        fileReader = new FileReader("src/main/java/com/mycompany/aaarascunho/sourceChar.txt");
        fileWriter = new FileWriter("src/main/java/com/mycompany/aaarascunho/destChar.txt");

        try {
            //reads a byte at a time, if it reached the end of the fiel, returns -1
            int content;
            while ((content = fileReader.read()) != -1) {
                fileWriter.write((char) content);
            }
        } finally {
            if (fileReader != null) {
                fileReader.close();
            }
            if (fileWriter != null) {
                fileWriter.close();
            }
        }
        

    }

    public static <T> void show(T item) {
        System.out.println(item);
    }

    public static <T> T show2(T item) {
        return item;
    }

    public static <T> void print(T[] array) {
        for (T t : array) {
            System.out.println(t);
        }
    }

}
