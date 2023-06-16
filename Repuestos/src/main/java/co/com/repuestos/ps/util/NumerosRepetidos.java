package co.com.repuestos.ps.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumerosRepetidos {
    public static void main (String[] args){
        List<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(2);
        numeros.add(5);
        numeros.add(2);
        numeros.add(7);
        numeros.add(4);
        numeros.add(3);
        numeros.add(9);
        numeros.add(7);

        Map<Integer, Integer> NumerosRepetidos = new HashMap<>();
        for (int valor : numeros){
            if (NumerosRepetidos.containsKey(valor)){
                NumerosRepetidos.put(valor, NumerosRepetidos.get(valor) + 1);
            } else {
                NumerosRepetidos.put(valor, 1);
            }
        }

        System.out.println("Los numeros que estan repetidos son: ");
        for (Map.Entry<Integer, Integer> entry : NumerosRepetidos.entrySet()) {
            if (entry.getValue() > 1){
                System.out.println(entry.getKey() + " y se repite " + entry.getValue() + " veces");
            }
        }
    }
}
