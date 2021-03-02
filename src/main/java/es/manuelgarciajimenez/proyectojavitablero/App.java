package es.manuelgarciajimenez.proyectojavitablero;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {        
        BorderPane paneRoot = new BorderPane();
        var scene = new Scene (paneRoot,800,600);
        stage.setScene(scene);
        stage.show();   
        
        
        
        Colores colores = new Colores();
        
        colores.generarTablero();
        
        ColoresView coloresView = new ColoresView(colores);
        paneRoot.setCenter(coloresView);
        
        
        
        //SIMULACION DEL JUEGO
                   
        //Funcionamiento del juego en sí.       
        colores.getSecuenciaNumeros();
        colores.getSecuenciaJugador(6);
        colores.comparacionSecuencia();
        
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