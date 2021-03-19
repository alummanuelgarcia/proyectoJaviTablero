package es.manuelgarciajimenez.proyectojavitablero;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {  
    
    BorderPane paneRoot = new BorderPane();
    
    @Override
    
    public void start(Stage stage) {        
        
        var scene = new Scene (paneRoot,800,600);
        stage.setScene(scene);
        stage.setTitle("SimonDice");
        stage.show();   
                
        
        Colores colores = new Colores(paneRoot);
        Puntuacion puntuacion = new Puntuacion(paneRoot,colores);
        puntuacion.ActualizarPuntuacion();
        
        
        
        //Genero el tablero de la partida
        colores.generarTablero();
        

        //Genero el primer numero de la secuencia de la partida
        colores.getSecuenciaNumeros();
              
        
        ColoresView coloresView = new ColoresView(colores,puntuacion);
        paneRoot.setCenter(coloresView);
        
        ColorJuego colorjuego = new ColorJuego(colores.nuevoNumSecuencia);
        //System.out.println("NuevoNumSecuencia"+colores.nuevoNumSecuencia);
        paneRoot.setTop(colorjuego);
        
        
        
        
        //paneRoot.setTop(puntuacion);
        
        
        
        //SIMULACION DEL JUEGO
                   
        //Funcionamiento del juego en sí.       
        //colores.getSecuenciaNumeros();
        //colores.getSecuenciaJugador(6);
        //colores.comparacionSecuencia();
        
        //colores.getSecuenciaNumeros();
        //colores.getSecuenciaJugador(3);
        
        //colores.getSecuenciaNumeros();
        //colores.getSecuenciaJugador(4);
        
        //olores.getSecuenciaNumeros();
        //colores.getSecuenciaJugador(7);
        
        //colores.getSecuenciaNumeros();
        //colores.getSecuenciaJugador(8);
    }

    public static void main(String[] args) {
        launch();
    }

}