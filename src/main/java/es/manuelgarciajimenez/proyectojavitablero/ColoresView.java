package es.manuelgarciajimenez.proyectojavitablero;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class ColoresView extends GridPane{
    
    Colores colores;
    final int TAM_X=100;
    final int TAM_Y=100;
    int contadorClicJugador=0;
    
    
    public ColoresView(Colores colores){
        this.colores = colores;
        this.setStyle("-fx-grid-lines-visible:true");
        for(int y=0; y<colores.numFilas; y++) {
            for(int x=0; x<colores.numColumnas; x++) {
                
                int num = colores.getNumPos(x, y);
                String strNum = String.valueOf(num);
                Label label = new Label(strNum);
                Rectangle r = new Rectangle();
                r.setWidth(100);
                r.setHeight(100);
                label.setPrefWidth(100);
                label.setPrefHeight(100);
                label.setAlignment(Pos.CENTER);
                
                switch(num){
                    case 1:                                         
                        r.setFill(Color.RED);
                        break;
                    case 2:
                        r.setFill(Color.BLUE);
                        break;
                    case 3:
                        r.setFill(Color.GREEN);
                        break;
                    case 4:
                        r.setFill(Color.YELLOW);
                        break;
                    case 5:
                        r.setFill(Color.PINK);
                        break;
                    case 6:
                        r.setFill(Color.MEDIUMORCHID);
                        break;
                    case 7:
                        r.setFill(Color.ORANGE);
                        break;
                    case 8:
                        r.setFill(Color.BROWN);
                        break;
                    case 9:
                        r.setFill(Color.GRAY);
                        break;
                }
                this.add(r, x, y);
                this.add(label, x, y);
            }
        }       
        this.setMaxHeight(TAM_Y * colores.numFilas);
        this.setMaxWidth(TAM_X * colores.numColumnas);
        this.controlRaton();
    }
    
    public void controlRaton() {
        this.setOnMouseClicked((MouseEvent mouseEvent) -> {
            
            //System.out.println("X: " + mouseEvent.getX() + ", Y: "+ mouseEvent.getY() );
            int colClic = (int)(mouseEvent.getX() / TAM_X);
            int filClic = (int)(mouseEvent.getY() / TAM_Y);
            //System.out.println("Col: " + colClic + ", Fil: " + filClic);
            
            int numElegido = colores.getNumPos(colClic, filClic);
            contadorClicJugador++;
            System.out.println("Contador Clic Jugador:"+ contadorClicJugador);
            colores.getSecuenciaJugador(numElegido);
            
            //this.colores = colores;
            if(contadorClicJugador == colores.contadorNumPartida ){
                
                colores.comparacionSecuencia();
                //colores.getSecuenciaNumeros();
                
            }
            
            //System.out.println("Número: " + numElegido);
        });
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
