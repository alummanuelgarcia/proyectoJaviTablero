package es.manuelgarciajimenez.proyectojavitablero;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
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
    }

    public static void main(String[] args) {
        launch();
    }

}