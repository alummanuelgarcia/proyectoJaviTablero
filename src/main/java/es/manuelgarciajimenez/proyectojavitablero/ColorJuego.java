package es.manuelgarciajimenez.proyectojavitablero;

import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class ColorJuego extends StackPane {
    
    Colores colores;
    ColoresView coloresView;
    
    
    // Metodo para ver el color que ha tocado en la secuencia de partida
    
    public ColorJuego(int nuevoNumSecuencia){
        
        
        // Rectangulo que muestra el color
        Rectangle rectangleColor = new Rectangle();
        rectangleColor.setHeight(100);
        rectangleColor.setWidth(100);
                      
        Label labelColor = new Label();
        
               
        // Color de la ficha aleatoria
        switch(nuevoNumSecuencia){
            case 1:
                rectangleColor.setFill(Color.RED);
                break;
            case 2:
                rectangleColor.setFill(Color.BLUE);
                break;
            case 3:
                rectangleColor.setFill(Color.GREEN);
                break;
            case 4:
                rectangleColor.setFill(Color.YELLOW);
                break;
            case 5:
                rectangleColor.setFill(Color.PINK);
                break;
            case 6:
                rectangleColor.setFill(Color.MEDIUMORCHID);
                break;
            case 7:
                rectangleColor.setFill(Color.ORANGE);
                break;
            case 8:
                rectangleColor.setFill(Color.BROWN);
                break;
            case 9:
                rectangleColor.setFill(Color.GRAY);
                break;
        }
        labelColor.setText(Integer.toString(nuevoNumSecuencia));       
        this.getChildren().add(labelColor);
        this.getChildren().add(rectangleColor);
    }
}
