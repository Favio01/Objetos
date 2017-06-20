/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg4.taller.pkg5;

/**
 *
 * @author note
 */
public class NAleatoreo {

    private int numeros[];

    public NAleatoreo(int n1) {
        this.numeros = new int[n1];
    }

    public void numerosAleatoreos() {
        System.out.println("numeros aleatoreos: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random() * 101 + 100);
            System.out.println(numeros[i]);
        }
    }

    public int cantNumerosPar() {
        int cantPar = 0;
        int cantImpar = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                cantPar = cantPar + 1;
            } else {
                cantImpar = cantImpar + 1;
            }
        }
        return cantPar;
    }

    public int cantNumerosImpar() {
        int cantPar = 0;
        int cantImpar = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                cantPar = cantPar + 1;
            } else {
                cantImpar = cantImpar + 1;
            }
        }
        return cantImpar;
    }

    public int sumaDeNumeros() {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
        }
        return suma;
    }

    public double promedio() {
        int suma = sumaDeNumeros();
        double promedio;

        promedio = suma / numeros.length;

        return promedio;
    }

    public void NumeroRepetido() {
        int Repetido = 0;
        int contRepetidos[] = new int [numeros.length];
        int posicionNum = 0;

        for (int i = 0; i < numeros.length; i++) {
            Repetido = numeros[i];
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[j] == Repetido) {
                    contRepetidos[i]++;
                }
            }
        }
        Repetido = 0;
        for (int i = 0; i < contRepetidos.length; i++) {
            if (Repetido < contRepetidos[i]){
                Repetido = contRepetidos[i];
                posicionNum = i;
            }
        }
        System.out.println("El numero mas repetido es: " + numeros[posicionNum] + " y se repitio " + contRepetidos[posicionNum] + " veces");
    }
}


