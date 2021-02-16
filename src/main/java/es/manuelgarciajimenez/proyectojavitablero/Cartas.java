
package es.manuelgarciajimenez.proyectojavitablero;

import java.util.Random;

public class Cartas {
         
    int[][]nums;
    int numSecuencia;
    
    
    public void generarTablero() {
        nums = new int [3][3];
        int serieTablero=1;
        
        for(int y=0; y<3;y++){
            for(int x=0; x<3;x++){               
                nums[x][y] = serieTablero++;                
            }          
        }
        this.mostrarPorConsola();      
    }

    
    public void mostrarPorConsola(){
        for(int y=0; y<3;y++){
            for(int x=0; x<3;x++){
                System.out.print(nums[x][y]+" ");
            }
            System.out.println();
        }
    }
    
    
    public int getNumAleatorio(int min, int max){
        Random random = new Random();        
        int num = random.nextInt(max-min+1)+ min;
        return num;
    }

    
    public int getSecuenciaNumeros(){     
        
        numSecuencia = getNumAleatorio(1,9);
        System.out.print(numSecuencia+" ");      
        return numSecuencia;      
    }
    
}
