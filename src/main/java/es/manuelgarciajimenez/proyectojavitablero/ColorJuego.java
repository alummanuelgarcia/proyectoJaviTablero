package es.manuelgarciajimenez.proyectojavitablero;

import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class ColorJuego extends Group {
    
    Colores colores;
    
    public ColorJuego(Colores colores){
        
        // Rectangulo que muestra el color
        Rectangle rectangleColor = new Rectangle();
        rectangleColor.setHeight(100);
        rectangleColor.setWidth(100);
        rectangleColor.setLayoutX(350);
        rectangleColor.setLayoutY(20);
        rectangleColor.setFill(Color.RED);
        this.getChildren().add(rectangleColor);
        
        this.colores = colores;
        Label labelColor = new Label();
        
        // Generacion del número de la partida en el Rectangulo Principal
        int nuevoNumSecuencia = colores.getSecuenciaNumeros();
        //labelColor.setLayoutX(50);
        //labelColor.setLayoutY(20);
        labelColor.setText(Integer.toString(nuevoNumSecuencia));       
        this.getChildren().add(labelColor);
        
    }
}
