package com.mycompany.aaarascunho;

import java.util.ArrayList;
import java.util.List;

public class TypeInference {

    public static <T> void add(T t, List<Bucket<T>> lista) {
        Bucket<T> bucket = new Bucket<>(t);
        lista.add(bucket);
        System.out.println("Item is added succestfully" + t.toString());

    }

    public static <T> List<T> add2(List<T> list, T item1, T item2) {
        list.add(item1);
        list.add(item2);
        return list;
    }

    public static void main(String[] args) {

        List<Bucket<String>> lista1 = new ArrayList<>();
        TypeInference.add("Augusto", lista1);

        List<Bucket<Integer>> lista2 = new ArrayList<>();
        TypeInference.add(100, lista2);

        // o ArrayList<>() que é passado como argumento tem seu tipo inferido
        // a partir do tipo do item que está sendo adicionado, ou seja,
        // String e Integer respectivamente.
        List<Integer> lista3 = add2(new ArrayList<>(), 1, 2);
        System.out.println(lista3);

        List<String> lista4 = add2(new ArrayList<>(), "aaaa", "bbbb");
        System.out.println(lista4);

    }

}

class Bucket<T> {

    private T item;

    public Bucket(T item) {
        this.item = item;
    }

    public T getItem() {
        return this.item;
    }

}
