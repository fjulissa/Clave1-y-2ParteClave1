/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package montecarlos;
import java.util.Scanner;

/**
 *
 * @author Fatima
 */
public class MonteCarlos {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        float total_simulaciones= 100000000;
        float suma=0; int resultado_simulado = 0;
        for(int i=0; i<total_simulaciones;i++){
            suma=(float) (suma+ Math.random());
        }
        resultado_simulado = (int) (suma/total_simulaciones);
        
   
                
Scanner entrada = new Scanner (System.in);
    
    
    System.out.println(" -*-o-*-o-*-o-*-o-*-o-*-o-*-o-*-o-*-o-*-");
    System.out.println("      1. Metodo de MonteCarlo");
    System.out.println("      2. Salir");
    System.out.println(" -*-o-*-o-*-o-*-o-*-o-*-o-*-o-*-o-*-o-*-");
    
        int opcion = entrada.nextInt();
    
    switch(opcion){
        
       
       
        
        case 1:
             System.out.println(" ~~o~~o~~o~~o~~o~~o~~o~~o~~o~~");
           System.out.println("El resultado tras MonteCarlo fue:  " + resultado_simulado);
             System.out.println(" ~~o~~o~~o~~o~~o~~o~~o~~o~~o~~");
        break;
        
        case 2:
        System.out.println("*****************************************");
        System.out.println("****GRACIAS**POR**USAR**ESTE**SISTEMA****");
        System.out.println("*****************BYE*********************");
                System.exit(0);
    }
    }
    
}

