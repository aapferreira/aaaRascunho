package com.mycompany.aaarascunho;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class aaaRascunho {
    
    //1. B, 2. B, 3. B, 4. B, 5. B, 6. B, 7. B, 8. B, 9. B, 10. C, 11. B, 12. A. 13. B, 14. B, 15. B, 16. B, 17. ?, 18. B, 19. B, 20. B
    //1. B, 2. B, 3. B, 4. B, 5. B, 6. B, 7. B, 8. B, 9. B, 10. C, 11. B, 12. A, 13. B, 14. B, 15. B, 16. B, 17. B, 18. B, 19. B, 20. B

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4);

        System.out.println(sum(numeros));

    }

    public static <T extends Number> Double sum(List<T> itens) {

        Double resultado = 0.0;

        for (T iten : itens) {
            resultado = resultado + iten.doubleValue();
        }

        return resultado;
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