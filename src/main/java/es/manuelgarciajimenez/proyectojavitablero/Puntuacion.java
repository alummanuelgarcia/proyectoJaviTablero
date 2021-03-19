
package es.manuelgarciajimenez.proyectojavitablero;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Puntuacion extends VBox {
        
        Colores colores;
        BorderPane paneroot;
        Text textoPuntuacionActual = new Text ("0");
        
        public Puntuacion(BorderPane paneRoot,Colores colores){
            
            this.paneroot = paneRoot;
            this.colores = colores;

            //Layout  puntuacion principal
            HBox panePuntuacion = new HBox();        
            panePuntuacion.setTranslateY(12);
            panePuntuacion.setTranslateX(185);
            panePuntuacion.setSpacing(10);
            paneroot.getChildren().add(panePuntuacion);
             

            //Layout puntuacion actual
            HBox panePuntuacionActual = new HBox();
            panePuntuacionActual.setTranslateX(50);
            panePuntuacionActual.setTranslateY(12);
            panePuntuacionActual.setSpacing(10);
            
            //Texto puntuacion actual
            Text textoPuntuacion = new Text ("Puntuación:");
            textoPuntuacion.setLayoutX(30);
            textoPuntuacion.setFont(Font.font(25));
            textoPuntuacion.setFill(Color.GREEN);

            panePuntuacionActual.getChildren().add(textoPuntuacion);

            paneroot.getChildren().add(panePuntuacionActual);

           

            //Texto Puntuacion
                      
            textoPuntuacionActual.setFont(Font.font(25));
            textoPuntuacionActual.setFill(Color.GREEN);
            
            panePuntuacion.getChildren().add(textoPuntuacionActual);
            
             
        }
      
        public void ActualizarPuntuacion(){
            
            textoPuntuacionActual.setText(String.valueOf(colores.puntuacion));
        }
        
}
