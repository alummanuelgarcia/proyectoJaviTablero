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
        
        Cartas cartas = new Cartas();
        cartas.generarTablero();
        
        cartas.getSecuenciaNumeros();
        cartas.getSecuenciaNumeros();
        cartas.getSecuenciaNumeros();
        cartas.getSecuenciaNumeros();
        cartas.getSecuenciaNumeros();
    }

    public static void main(String[] args) {
        launch();
    }

}