
package es.manuelgarciajimenez.proyectojavitablero;

import java.util.Random;

public class Colores {
         
    int[][]nums;   
    int numFilas=3;
    int numColumnas=3;
    
    //Secuencia se guarda aquí porque la secuencia tiene que estar vacia al principio de todo
    //y se va a ir rellenando conforme llamemos al método getSecuenciaNumeros.
    String secuencia="";
    
    String secuenciaJugador="";
    
    public void generarTablero() {
        nums = new int [3][numFilas];
        int serieTablero=1;
        
        for(int y=0; y<numFilas;y++){
            for(int x=0; x<numColumnas;x++){               
                nums[x][y] = serieTablero++;                
            }          
        }
        this.mostrarPorConsola();      
    }

    
    public void mostrarPorConsola(){
        for(int y=0; y<numFilas;y++){
            for(int x=0; x<numColumnas;x++){
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
        System.out.println("Secuencia de Partida:" + secuencia);       
        return nuevoNumSecuencia;      
    }
    
    
    public void getSecuenciaJugador(int numJugador){
        
        secuenciaJugador = secuenciaJugador + Integer.toString(numJugador);
        System.out.println("Secuencia Jugador:"+secuenciaJugador);
        
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
    
    
    public void comparacionSecuencia(){
        if(secuencia.equals(secuenciaJugador)){
            System.out.println("Has acertado");                  
        }else{
            System.out.println("Has fallado");
        }
    }
}
