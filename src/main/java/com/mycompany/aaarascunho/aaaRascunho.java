package com.mycompany.aaarascunho;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class aaaRascunho {
    
    public static HashMap documentosProblematicos = new HashMap();
    
    //1. B, 2. A, 3. C, 4. A, 5. A, 6. C, 7. B, 8. B, 9. B, 10. A, 11. C, 12. ?, 13. C, 14. A, 15. B, 16. C, 17. A, 18. ?, 19. ?, 20. B
    //1. B, 2. A, 3. C, 4. A, 5. B, 6. C, 7. B, 8. B, 9. B, 10. A, 11. C, 12. B, 13. C, 14. A, 15. B, 16. C, 17. A, 18. A, 19. C, 20. B

    public static void main(String[] args) {

        String documento = "00064569004008";
        
        if ("00074569004008".equals(documento)) {
            System.out.println("Documento igual a 00074569004008");
        }
        
    }

    public aaaRascunho() {
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

class HashTableTest1<K, V> {

    private K key;
    private V value;

    public HashTableTest1(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "HashTableTest{" + "key=" + key + ", value=" + value + '}';
    }

}

class AlunoR implements Serializable {

    private String nome;
    private BigDecimal nota;

    public AlunoR(String nome, BigDecimal nota) {
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

class Produto1 {

    private String nome;
    private Double preco;
    private Double desconto;
    private Double frete;

    public Produto1(String nome, Double preco, Double desconto, Double frete) {
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