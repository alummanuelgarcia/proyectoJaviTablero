package es.manuelgarciajimenez.proyectojavitablero;

import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class ColorJuego extends Group {
    
    public ColorJuego(){
        Rectangle rectangleColor = new Rectangle();
        rectangleColor.setHeight(100);
        rectangleColor.setWidth(100);
        rectangleColor.setFill(Color.RED);
        this.getChildren().add(rectangleColor);
        
        Label labelColor = new Label();
        labelColor.setText("23");
        this.getChildren().add(labelColor);
    }
}
