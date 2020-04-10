package com.matera.wcc.calculadora;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class CollectionTest {

    private void verificarLista(List <String> list) {
        list.add("TESTE");
        list.add("TESTE");

        assertThat(list).hasSize(2);
        assertThat(list).containsExactly("TESTE", "TESTE");
    }

    @Test
    public void arrayList() {
        verificarLista(new ArrayList<>());
    }


    @Test
    public void linkedList() {
        verificarLista(new LinkedList<>());
    }

    @Test
    public void hashSet() {
        Set<String> set = new HashSet<String>();
        set.add("BRUNO");
        set.add("BRUNO");

        assertThat(set).hasSize(1);
        assertThat(set).containsExactly("BRUNO");
    }

    @Test
    public void hashSetOrder() {
        Set<String> set = new HashSet<String>();
        set.add("BRUNO");
        set.add("BRUNO2");
        set.add("BRUNO3");
        set.add("BRUNO4");

        assertThat(set).hasSize(4);
        assertThat(set).containsExactlyInAnyOrder("BRUNO", "BRUNO2", "BRUNO3", "BRUNO4");
    }

    @Test
    public void map() {
        Map<String, String> map = new HashMap<>();

        map.put("batata", "abacaxi");
        map.put("batata", "banana");

        assertThat(map).hasSize(1);
        assertThat(map.get("batata")).isEqualTo("banana");
    }

}
