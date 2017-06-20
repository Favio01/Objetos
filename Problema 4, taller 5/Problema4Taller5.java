/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg4.taller.pkg5;
import java.util.Scanner;
/**
 *
 * @author note
 */
public class Problema4Taller5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in); 
        int numero;
        
        
        System.out.println("Ingrese un numero entre 100 y 200");
        numero =sc.nextInt();
        
        NAleatoreo numeroN = new NAleatoreo(numero);
        if ((numero>100) && (numero<200)) {
        //numeroN.numerosAleatoreos();// (para mostrar la lista de numeros aleatoreso entre 100 y 200)
        
        System.out.println("La cantidad de numeros impares es: "+numeroN.cantNumerosImpar());
        System.out.println("La cantidad de numeros pares es: "+numeroN.cantNumerosPar());
        numeroN.sumaDeNumeros();
        System.out.println("El promedio de los numeros en la lista es: " + numeroN.promedio());
        
        numeroN.NumeroRepetido();
        }else
        System.out.println("Fin del programa"); 
    }
    
}
