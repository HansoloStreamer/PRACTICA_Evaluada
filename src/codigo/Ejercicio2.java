/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Ejercicio2 {


    public static void main(String[] args) {
        double IVA = 0.13;
        
        int cantidad = 3;
        int Id1 = 1;
        double cantProd1 = 5;

        String[] Producto1 = {"Laptop","Nuevo"};
        double precio1 = 200;
        double catTecnologia = 30;
        double Tot1 = (precio1 + catTecnologia) * IVA;
        
          int Id2 = 2;
         double cantProd2 = 4;
          String[] Producto2 = {"Laptop","Usado"};
          double precio2 = 50;
          double catRopa = 20;
          double Tot2 = (precio2 + catRopa) * IVA;
        
          int Id3 = 3;
          double cantProd3 = 3;
          String[] Producto3 = {"Laptop","Nuevo"};
          double precio3 = 500;
          double catAccesorio = 30;
          double Tot3 = (precio3 + catAccesorio) * IVA;
          
          double TotGral = Tot1 + Tot2 + Tot3;
          double TotProd = cantProd1 + cantProd2 + cantProd3;
        
        System.out.println("Los datos del primer producto son: id:" + Id1 + " Producto:" + Producto1[0] +" " + "Precio:" + precio1 + " " + "Estado:" +Producto1[1]);
     
                System.out.println("Los datos del primer producto son: id:" + Id2 + " Producto:" + Producto2[0] +" " +"Precio:" + precio2 + " " + "Estado:" + Producto2[1]);
                
                System.out.println("Los datos del primer producto son: id:" + Id3 + " Producto:" + Producto3[0] +" " + "Precio"+ precio3 + "Estado:" + Producto3[1]);
                
                System.out.println("La cantidad de productos usados es: " +cantProd2);
                
                System.out.println("Productos que pertenecen a Accesorios: " +cantProd3);
                
                System.out.println("La suma de los precios de las 3 ventas es: " +TotGral);
        
               
        
            
        }
           
        
    
        
        
    }


    

    
