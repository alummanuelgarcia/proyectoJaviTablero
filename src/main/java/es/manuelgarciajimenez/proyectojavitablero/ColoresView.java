package es.manuelgarciajimenez.proyectojavitablero;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class ColoresView extends GridPane{
    
    Colores colores;
    
    
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
        this.setMaxHeight(100 * colores.numFilas);
        this.setMaxWidth(100 * colores.numColumnas);
        this.controlRaton();
    }
    
    private void controlRaton() {
        this.setOnMouseClicked((MouseEvent mouseEvent) -> {
            System.out.println("X: " + mouseEvent.getX() + ", Y: "+ mouseEvent.getY() );
            int colClic = (int)(mouseEvent.getX() / 800);
            int filClic = (int)(mouseEvent.getY() / 600);
            System.out.println("Col: " + colClic + ", Fil: " + filClic);
            int num = colores.getNumPos(colClic, filClic);
            System.out.println("Número: " + num);
        });
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
