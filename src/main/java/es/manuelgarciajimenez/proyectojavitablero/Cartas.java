
package es.manuelgarciajimenez.proyectojavitablero;

import java.util.Random;

public class Cartas {
         
    public void generarCartas() {
        int numGenerados [][] = new int [4][4];
        numGenerados [0][0]= getNumAleatorio(1,16);
        for(int y=0; y<4; y++) {
            for(int x=0; x<4; x++) {
                //int cartasGenerador [x][y] = JUGADOR_NO;
                System.out.print(numGenerados[x][y]);
            }
            System.out.println(numGenerados[0][0]);
        }
    }
    
    public int getNumAleatorio(int min, int max){
        Random random = new Random();        
        int num = random.nextInt(max-min+1)+ min;
        return num;
    }
}
