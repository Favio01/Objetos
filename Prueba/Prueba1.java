/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.util.Scanner;

/**
 *
 * @author note
 */
public class Prueba1 {

    private String respuestasCorrectas[];
    private int puntaje;
    private double nota;

    public Prueba1() {
        this.respuestasCorrectas = new String[10];
        this.puntaje = 0;
        this.nota = 0;
    }

    public void generarListaRandom() {
        String[] alternativas = {"a", "b", "c"};
        int desicion = 0;
        for (int i = 0; i < this.respuestasCorrectas.length; i++) {
            desicion = (int) (Math.random() * 3);
            this.respuestasCorrectas[i] = alternativas[desicion];
            //System.out.println(" random " + this.respuestasCorrectas[i]);//
        }
    }

    public String ingresarResp(int i) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la respuesta " + (i+1));
        return sc.nextLine();
    }

    public void calcularPuntaje() {
        for (int i = 0; i < this.respuestasCorrectas.length; i++) {
            if (ingresarResp(i).equals(this.respuestasCorrectas[i]));
            this.puntaje = this.puntaje + 10;
        }
        System.out.println("El puntaje es: "  + this.puntaje);
    }

    public void calcularNota() {
        if (this.puntaje >= 60) {
            this.nota = (this.puntaje * 0.06) + 1;
        } else {
            this.nota = this.puntaje * 0.05+1;
        }
        System.out.println("La nota es: " + this.nota);
    }
}
