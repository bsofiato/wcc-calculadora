package com.matera.wcc.calculadora;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CollectionTest {

    @Test
    public void arrayList() {
        List<String> list = new ArrayList<String>();
        list.add("TESTE");
        list.add("TESTE");

        assertThat(list).hasSize(2);
        assertThat(list).containsExactly("TESTE", "TESTE");
    }


    @Test
    public void linkedList() {
        List<String> list = new LinkedList<>();
        list.add("TESTE");
        list.add("TESTE");

        assertThat(list).hasSize(2);
        assertThat(list).containsExactly("TESTE", "TESTE");
    }

}
