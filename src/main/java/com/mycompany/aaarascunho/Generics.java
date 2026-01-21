package com.mycompany.aaarascunho;

import java.math.BigDecimal;
import java.net.UnknownHostException;

public class Generics {

    public static void main(String[] args) throws UnknownHostException {

//        show(10);
//        show(10.5);
//        
//        System.out.println(show2(10));
//        System.out.println(show2(10.5));
//        
//        Integer[] nums = {1, 2, 3 , 4};
//        print(nums);
//
//        String[] nomes = {"a", "b", "c" , "d"};
//        print(nomes);
        
        System.out.println(minimum(10, 34));
        System.out.println(minimum(new Person("aaa", 10), new Person("bbb", 34)));

    }
    
    public static <T> void show(T item) {
        System.out.println(item);
    }

    public static <T> T show2(T item) {
        return item;
    }
    
    public static <T> void print(T[] array){
        for (T t : array) {
            System.out.println(t);
        }
    }
    
    //bounded type paramenter
    public static <T extends Comparable<T>> T minimum(T t1, T t2) {
        
        if (t1.compareTo(t2) < 0) {
            return t1;
        }
        
        return t2;
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

class Person implements Comparable<Person>{

    private String nome;
    private Integer age;

    public Person(String nome, Integer age) {
        this.nome = nome;
        this.age = age;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "Person{nome=" + nome + "age=" + age + '}';
    }

    @Override
    public int compareTo(Person otherPerson) {
        return Integer.compare(this.getAge(), otherPerson.getAge());
    }
    
}


class Aluno {

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