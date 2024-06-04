
package com.mycompany.numero_pi;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 *
 * @author lisSyke
 * ingrese un número y haga que el programa genere PI hasta esa cantidad 
 * de decimales. Mantenga un límite de hasta dónde llegará el programa.
 */
public class Prueba {

    public static void main(String[] args) {
       Scanner entrada=new Scanner(System.in);
       System.out.println("Ingrese el número de decimales a mostar");
       System.out.println("PROCURE QUE NO SEA NEGATIVO O MAYOR A 20");
       int i = entrada.nextInt(); 
       
       BigDecimal pi= new BigDecimal(Math.PI); //Convertimos PI en un BigDecmial
       BigDecimal piRedon= pi.setScale(i, RoundingMode.UP); //piRedon= Pi redondeado
       //Va a tomar el entero y lo va a redondear el número de veces que diga "i"
       
       if (i>20||i<0){
          System.out.println("~~~~~~~~ EL NÚMERO ES ~~~~~~~~");
          System.out.println("El número no cumplen el límte propuesto");
       }else{
           System.out.println("El número es"+"\n"+piRedon);
       }
    }
}
