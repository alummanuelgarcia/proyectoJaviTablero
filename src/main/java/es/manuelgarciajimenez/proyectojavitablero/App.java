package es.manuelgarciajimenez.proyectojavitablero;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {        
        Pane paneRoot = new Pane();
        var scene = new Scene (paneRoot,800,600);
        stage.setScene(scene);
        stage.show();      
        
        Colores colores = new Colores();
        colores.generarTablero();
        
        
        colores.getSecuenciaNumeros();                             
        colores.getSecuenciaNumeros();               
        colores.getSecuenciaNumeros();
        colores.getSecuenciaNumeros();
        colores.getSecuenciaNumeros();


        
    }

    public static void main(String[] args) {
        launch();
    }

}