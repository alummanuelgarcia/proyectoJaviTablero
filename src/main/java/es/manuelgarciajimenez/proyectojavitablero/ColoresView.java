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
    
    public ColoresView(Colores colores){
        this.colores = colores;
        this.setStyle("-fx-grid-lines-visible:true");
        for(int y=0; y<colores.numFilas; y++) {
            for(int x=0; x<colores.numColumnas; x++) {
                int num = colores.getNumPos(x, y);
                if(num == 1){                   
                    String strNum = String.valueOf(num);
                    Label label = new Label(strNum);
                    Rectangle r = new Rectangle();
                    r.setWidth(100);
                    r.setHeight(100);
                    label.setPrefWidth(100);
                    label.setPrefHeight(100);
                    label.setAlignment(Pos.CENTER);                   
                    r.setFill(Color.RED);
                    this.add(r, x, y);
                    this.add(label, x, y);
                }
                if(num == 2){
                    String strNum = String.valueOf(num);
                    Label label = new Label(strNum);
                    Rectangle r = new Rectangle();
                    r.setWidth(100);
                    r.setHeight(100);
                    label.setPrefWidth(100);
                    label.setPrefHeight(100);
                    label.setAlignment(Pos.CENTER);
                    r.setFill(Color.BLUE);
                    this.add(r, x, y);
                    this.add(label, x, y);
                }
                if(num == 3){
                    String strNum = String.valueOf(num);
                    Label label = new Label(strNum);
                    Rectangle r = new Rectangle();
                    r.setWidth(100);
                    r.setHeight(100);
                    label.setPrefWidth(100);
                    label.setPrefHeight(100);
                    label.setAlignment(Pos.CENTER);
                    r.setFill(Color.GREEN);
                    this.add(r, x, y);
                    this.add(label, x, y);
                }
                if(num == 4){
                    String strNum = String.valueOf(num);
                    Label label = new Label(strNum);
                    Rectangle r = new Rectangle();
                    r.setWidth(100);
                    r.setHeight(100);
                    label.setPrefWidth(100);
                    label.setPrefHeight(100);
                    label.setAlignment(Pos.CENTER);
                    r.setFill(Color.YELLOW);
                    this.add(r, x, y);
                    this.add(label, x, y);
                }
                if(num == 5){
                    String strNum = String.valueOf(num);
                    Label label = new Label(strNum);
                    Rectangle r = new Rectangle();
                    r.setWidth(100);
                    r.setHeight(100);
                    label.setPrefWidth(100);
                    label.setPrefHeight(100);
                    label.setAlignment(Pos.CENTER);
                    r.setFill(Color.PINK);
                    this.add(r, x, y);
                    this.add(label, x, y);
                }
                if(num == 6){
                    String strNum = String.valueOf(num);
                    Label label = new Label(strNum);
                    Rectangle r = new Rectangle();
                    r.setWidth(100);
                    r.setHeight(100);
                    label.setPrefWidth(100);
                    label.setPrefHeight(100);
                    label.setAlignment(Pos.CENTER);
                    r.setFill(Color.MEDIUMORCHID);
                    this.add(r, x, y);
                    this.add(label, x, y);
                }
                if(num == 7){
                    String strNum = String.valueOf(num);
                    Label label = new Label(strNum);
                    Rectangle r = new Rectangle();
                    r.setWidth(100);
                    r.setHeight(100);
                    label.setPrefWidth(100);
                    label.setPrefHeight(100);
                    label.setAlignment(Pos.CENTER);
                    r.setFill(Color.ORANGE);
                    this.add(r, x, y);
                    this.add(label, x, y);
                }
                if(num == 8){
                    String strNum = String.valueOf(num);
                    Label label = new Label(strNum);
                    Rectangle r = new Rectangle();
                    r.setWidth(100);
                    r.setHeight(100);
                    label.setPrefWidth(100);
                    label.setPrefHeight(100);
                    label.setAlignment(Pos.CENTER);
                    r.setFill(Color.BROWN);
                    this.add(r, x, y);
                    this.add(label, x, y);
                }
                if(num == 9){
                    String strNum = String.valueOf(num);
                    Label label = new Label(strNum);
                    Rectangle r = new Rectangle();
                    r.setWidth(100);
                    r.setHeight(100);
                    label.setPrefWidth(100);
                    label.setPrefHeight(100);
                    label.setAlignment(Pos.CENTER);
                    r.setFill(Color.GRAY);
                    this.add(r, x, y);
                    this.add(label, x, y);
                }
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
            colores.getSecuenciaJugador(numElegido);
            colores.comparacionSecuencia();
            System.out.println("Número: " + numElegido);
        });
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
