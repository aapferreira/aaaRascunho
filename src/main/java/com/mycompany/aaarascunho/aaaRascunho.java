package com.mycompany.aaarascunho;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.apache.commons.codec.digest.DigestUtils;

public class aaaRascunho {
    
    public static HashMap documentosProblematicos = new HashMap();
    
    // 1. A, 2. B, 3. D, 4. A, 5. C, 6. B, 7. ?, 8. A, 9. B, 10. B, 11. B, 12. A, 13. C, 14. B, 15. ?, 16. B, 17. ?, 18. A, 19. B, 20. C
    // 1. B, 2. B, 3. B, 4. C, 5. C, 6. C, 7. B, 8. A, 9. B, 10. B, 11. B, 12. A, 13. C, 14. B, 15. B, 16. B, 17. C, 18. B, 19. B, 20. B
    
    public static void main(String[] args) {
        
        System.out.println(0.032 * 0.32);
        
        String leituraLinha = "2      433112022062921341202206292134000000000000000000000000001                                                                                                                                                                                                                                                                                                                                                                                                                                                               000";
        
        System.out.println(leituraLinha.substring(11,12).trim());
        System.out.println(leituraLinha.substring(37,38).trim());
        System.out.println(leituraLinha.substring(511, 514));
        
    }

    public static String geraToken(String s) {
        return DigestUtils.md5Hex(DigestUtils.md5Hex(s)) + DigestUtils.md5Hex(DigestUtils.md5Hex(s));
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