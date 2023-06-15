package co.com.repuestos.ps.util;

import java.util.Arrays;

public class InvertirArreglo {

    public static void main (String[] args) {
        int [] arreglo = {1,2,3,4,5,6,7,8,9};

        System.out.println("El arreglo inicial es: " + Arrays.toString(arreglo));

        int [] arregloInvertido = new int[arreglo.length];
        int j = 0;
        for (int i = arreglo.length - 1; i >= 0; i--) {
            arregloInvertido[j] = arreglo[i];
            j = j + 1;
        }
        System.out.println("El arreglo invertido es: " + Arrays.toString(arregloInvertido));
    }
}
