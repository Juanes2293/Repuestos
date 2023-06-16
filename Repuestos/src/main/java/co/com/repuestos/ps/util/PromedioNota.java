package co.com.repuestos.ps.util;

import java.util.HashMap;
import java.util.Map;

public class PromedioNota {
    public static void main (String[] args) {

        Map<String, Double> map = new HashMap<>();

        map.put("Juan", 4.5);
        map.put("Paula", 4.7);
        map.put("Helena", 4.8);
        map.put("Alejandra", 4.3);
        map.put("Santiago", 4.0);

        String mayorNota = " ";
        String menorNota = " ";
        Double MayorNota = 0.0;
        Double MenorNota = 5.0;
        Double total = 0.0;

        for (Map.Entry<String, Double> entry : map.entrySet()) {
            String nombre = entry.getKey();
            Double valor = entry.getValue();
            total += valor;

            if (MayorNota < valor ){
                MayorNota = valor;
                mayorNota = nombre;
            }
            if (MenorNota > valor){
                MenorNota = valor;
                menorNota = nombre;
            }
        }
        Double promedio = total / map.size();
        System.out.println("La menor nota la tiene: " + menorNota + " y la nota es de: " + MenorNota);
        System.out.println("La mayor nota la tiene: " + mayorNota + " y la nota es de: " + MayorNota);
        System.out.println("El primedio de notas es de: " + promedio);

    }
}
