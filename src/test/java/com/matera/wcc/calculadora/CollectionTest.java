package com.matera.wcc.calculadora;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CollectionTest {

    private void verificarLista(List <String> list) {
        list.add("TESTE");
        list.add("TESTE");

        assertThat(list).hasSize(2);
        assertThat(list).containsExactly("TESTE", "TESTE");
    }
-m ""
    @Test
    public void arrayList() {
        verificarLista(new ArrayList<>());
    }


    @Test
    public void linkedList() {
        verificarLista(new LinkedList<>());
    }

}
