package es.manuelgarciajimenez.proyectojavitablero;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;


public class ColoresView extends GridPane{
    
    public ColoresView(Colores colores){
        this.setStyle("-fx-grid-lines-visible:true");
        for(int y=0; y<colores.numFilas; y++) {
            for(int x=0; x<colores.numColumnas; x++) {
                int num = colores.getNumPos(x,y); 
                String strNum = String.valueOf(num);
                Label label = new Label(strNum);
                label.setPrefWidth(100);
                label.setPrefHeight(100);
                label.setAlignment(Pos.CENTER);
                this.add(label, x, y);
            }
        }
        this.setMaxHeight(150);
        this.setMaxWidth(150);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
