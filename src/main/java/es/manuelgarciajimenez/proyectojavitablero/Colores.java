
package es.manuelgarciajimenez.proyectojavitablero;

import java.util.Random;
import javafx.scene.layout.BorderPane;

public class Colores {
       
    ColoresView ColoresView;
    int[][]nums;   
    int numFilas=3;
    int numColumnas=3;
    int contadorNumPartida=0;
    int contadorClicJugador=0;
    ColorJuego colorjuego;
    //Secuencia se guarda aquí porque la secuencia tiene que estar vacia al principio de todo
    //y se va a ir rellenando conforme llamemos al método getSecuenciaNumeros.
    String secuencia="";
    
    String secuenciaJugador="";
    int nuevoNumSecuencia;
    BorderPane paneroot;
    
    public Colores(BorderPane paneRoot){
        this.paneroot = paneRoot;
    }
    
    
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

    public void getSecuenciaNumeros(){     
        
               
        nuevoNumSecuencia = getNumAleatorio(1,9);
            
        secuencia =  secuencia + Integer.toString(nuevoNumSecuencia);
        contadorNumPartida++;
                      
        secuenciaJugador= "";
        System.out.println("Contador nº partida:"+ contadorNumPartida);
        System.out.println("Secuencia de Partida:" + secuencia);       
              
    }
    
    
    public void getSecuenciaJugador(int numElegido){
        
        secuenciaJugador = secuenciaJugador + Integer.toString(numElegido);
        //System.out.println("Secuencia Jugador:"+ secuenciaJugador);
        
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
            this.getSecuenciaNumeros();
            ColorJuego nuevoColorJuego = new ColorJuego(nuevoNumSecuencia);
            this.paneroot.setTop(nuevoColorJuego);
            contadorClicJugador = 0 ;
            
            
        }else{
            System.out.println("Has fallado");
        }
    }
}
