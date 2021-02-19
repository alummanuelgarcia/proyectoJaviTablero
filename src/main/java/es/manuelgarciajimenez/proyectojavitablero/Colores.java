
package es.manuelgarciajimenez.proyectojavitablero;

import java.util.Random;

public class Colores {
         
    int[][]nums;
    
    
    //secuencia se guarda aquí porque la secuencia tiene que estar vacia al principio de todo
    //y se va a ir rellenando conforme llamemos al método getSecuenciaNumeros.
    String secuencia="";
    
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
        int nuevoNumSecuencia;
               
        nuevoNumSecuencia = getNumAleatorio(1,9);
        secuencia =  secuencia + Integer.toString(nuevoNumSecuencia);
        System.out.println(secuencia);       
        return nuevoNumSecuencia;      
    }
    
    public int getNumPos (int posx, int posy){
        try{
            return nums[posx][posy];
        } catch (Exception ex){
            System.out.println("La posicion es incorrecta");
            //Returnamos -1 porque necesitamos un return
            //de tipo int.
            return -1;
        }
    }
}
