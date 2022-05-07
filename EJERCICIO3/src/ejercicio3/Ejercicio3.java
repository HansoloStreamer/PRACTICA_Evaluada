/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;


import java.util.Scanner;
/**
 *
 * @author Dimaxx Durán
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       //lectura de datos
       Scanner leer = new Scanner(System.in);
        System.out.println("igrese el numero de posiciones");
        int num = leer.nextInt();
        
        String []arreglo = new String [num];
        
        for(int i =0; i< arreglo.length; i++){
            System.out.println("ingrese un valor");
            String caracter = leer.next();
                arreglo[i]=caracter;
            if(arreglo[i] == "p"){
               
               System.out.println("positivos"+i+"_"+arreglo[i]);
            }
        }
       for(int i =0; i<arreglo.length;i++){
          System.out.println("negativos"+i+"->"+arreglo[i]);
        

       }
    }
    
}
