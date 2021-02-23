package es.manuelgarciajimenez.proyectojavitablero;

import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;


public class ColoresView extends GridPane{
    
    public ColoresView(Colores colores){
        for(int y=0; y<3; y++) {
            for(int x=0; x<3; x++) {
                int num = colores.getNumPos(x,y); 
                String strNum = String.valueOf(num);
                Label label = new Label(strNum);
                this.add(label, x, y);
            }
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
