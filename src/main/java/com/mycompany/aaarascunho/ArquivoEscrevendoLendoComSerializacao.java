package com.mycompany.aaarascunho;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

public class ArquivoEscrevendoLendoComSerializacao {

    public static void main(String[] args) {

        Aluno a = new Aluno("aaaaa", new BigDecimal(BigInteger.ONE));

        String filename = "/home/apferreira/Desktop/teste.txt";

        FileOutputStream fileOut = null;
        ObjectOutputStream objOut = null;

        try {
            fileOut = new FileOutputStream(filename);
            objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(a);

            objOut.close();
            fileOut.close();

            System.out.println("ok");

        } catch (Exception e) {
            System.out.println("erro");
        }

        FileInputStream fileIn = null;
        ObjectInputStream objIn = null;

        try {
            fileIn = new FileInputStream(filename);
            objIn = new ObjectInputStream(fileIn);

            Aluno b = (Aluno) objIn.readObject();

            System.out.println(b);

            objIn.close();
            fileIn.close();

        } catch (Exception e) {
            System.out.println("erro");
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

class HashTableTest<K, V> {

    private K key;
    private V value;

    public HashTableTest(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "HashTableTest{" + "key=" + key + ", value=" + value + '}';
    }

}

class Aluno implements Serializable {

    private String nome;
    private BigDecimal nota;

    public Aluno(String nome, BigDecimal nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getNota() {
        return nota;
    }

    public void setNota(BigDecimal nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", nota=" + nota + '}';
    }

}

class Produto {

    private String nome;
    private Double preco;
    private Double desconto;
    private Double frete;

    public Produto(String nome, Double preco, Double desconto, Double frete) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
        this.frete = frete;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Double getFrete() {
        return frete;
    }

    public void setFrete(Double frete) {
        this.frete = frete;
    }

    @Override
    public String toString() {
        return "Produto: " + nome;
    }

}
