/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas;

import java.util.Random;

public class Sembrador {

    void sembrarCorazon(Celda lasCeldas[][], int cantidad) {

        Random aleatorio;
        aleatorio = new Random();
        int corazonAleatorio;
        int sumatoria = 0;

        for (Celda[] laFila : lasCeldas) {

            for (Celda laCelda : laFila) {

                corazonAleatorio = aleatorio.nextInt(10);
                if (corazonAleatorio > 5 && sumatoria < cantidad) {

                    Corazon unCorazon = new Corazon();
                    laCelda.setMiCorazon(unCorazon);
                    sumatoria++;
                }
            }
        }
        

    
    
    int x,y;
      
       int contador =0;
       for(x=-1; x<=2; x++){
           for (y=-1;y <=2; y++){
               if (laCelda[laFila+x][columna+y].getCorazon ()!= null){
                 contador ++;  
               }
           
          
       }
       }
        
     } 
    
    
}

