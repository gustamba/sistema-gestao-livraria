package br.com.gustamba.livraria.teste;

import java.util.HashMap;
import java.util.Map;

public class javautilmap {
    public static void main(String[] args) {
        Map<String, Double> mapa = new HashMap<>();

        mapa.put("cab123", 5.99);

        Double valor = mapa.get("cab123");
        System.out.println(valor);
    }
}
