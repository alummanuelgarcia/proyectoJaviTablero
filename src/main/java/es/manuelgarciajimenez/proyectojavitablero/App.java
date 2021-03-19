package es.manuelgarciajimenez.proyectojavitablero;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
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
                
        //Creo colores que es la clase del funcionamiento del juego
        Colores colores = new Colores(paneRoot);
        
        //Creo puntuacion donde se va a guardar la puntuación del juego
        Puntuacion puntuacion = new Puntuacion(paneRoot,colores);
        puntuacion.ActualizarPuntuacion();            
        
        //Genero el tablero de la partida
        colores.generarTablero();
        

        //Genero el primer numero de la secuencia de la partida
        colores.getSecuenciaNumeros();
              
        //Creo ColoresView que es el tablero con sus formas y colores
        ColoresView coloresView = new ColoresView(colores,puntuacion);
        paneRoot.setCenter(coloresView);
        
        //Creo el colorjuego que es el color que tienes que memorizar
        ColorJuego colorjuego = new ColorJuego(colores.nuevoNumSecuencia);
        paneRoot.setTop(colorjuego);
        
        //Reinicio
        scene.setOnKeyPressed((KeyEvent event) -> {
                            switch (event.getCode()) {
                                case ESCAPE:
                                    System.out.println("Reinicio");
                                    
                                    //Reinicio HBox
                                    HBox paneReinicio = new HBox();
                                    paneReinicio.setAlignment(Pos.TOP_CENTER);
                                    paneReinicio.setMinHeight(70);
                                    paneRoot.setBottom(paneReinicio);
                                    paneReinicio.setSpacing(20);
                                    

                                    Text textoPuntuacion = new Text ("Has Reiniciado! Suerte!");
                                    textoPuntuacion.setLayoutX(30);

                                    textoPuntuacion.setFont(Font.font(25));
                                    textoPuntuacion.setFill(Color.GREEN);

                                    paneReinicio.getChildren().add(textoPuntuacion);
                                    //Reinicio variables y llamamos a nuevos métodos
                                    colores.puntuacion=0;
                                    colores.nuevoNumSecuencia=0;
                                    colores.secuencia="";
                                    colores.secuenciaJugador="";
                                    colores.contadorNumPartida=0;
                                    colores.generarTablero();
                                    puntuacion.ActualizarPuntuacion();
                                    colores.getSecuenciaNumeros();
                                    ColorJuego colorJuegoReinicio = new ColorJuego(colores.nuevoNumSecuencia);
                                    paneRoot.setTop(colorJuegoReinicio);
                                    ColoresView coloresViewReinicio = new ColoresView(colores,puntuacion);                                  
                                    paneRoot.setCenter(coloresViewReinicio);
                                    break;
                            }
        });
        
    }
       

    public static void main(String[] args) {
        launch();
    }

}