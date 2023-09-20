/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx_1;

import java.io.InputStream;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author LEANS
 */
public class JavaFX_1 extends Application{
    
   
    public void cicloFX(){
         System.out.println("metodo constructor ");
    }
    
    
    @Override
    public void init(){
        System.out.println("Metodo init()");
        
    }
    
     
    
    @Override
    public void start(Stage primaryStage){
        
        ////////////////////////////////////////////////////
        /* BOTONES Y MARGIN 
        Button btn1 = new Button("BOTON 1");
        Button btn2 = new Button("BOTON 2");
        Button btn3 = new Button("BOTON 3");
        Button btn4 = new Button("BOTON 4");
        Button btn5 = new Button("BOTON 5");
        
        BorderPane root = new BorderPane();
        
        root.setCenter(btn1);
        btn1.setMaxWidth(Double.MAX_VALUE);
        btn1.setMaxHeight(Double.MAX_VALUE);
        BorderPane.setMargin(btn1,new Insets(5, 5, 5, 5));
                
        
        root.setTop(btn2);
        btn2.setMaxWidth(Double.MAX_VALUE);
        btn2.setMaxHeight(Double.MAX_VALUE);
        
        
        root.setBottom(btn3);
        btn3.setMaxWidth(Double.MAX_VALUE);
        btn3.setMaxHeight(Double.MAX_VALUE);
        
        root.setRight(btn4);
        btn4.setMaxWidth(Double.MAX_VALUE);
        btn4.setMaxHeight(Double.MAX_VALUE);
        BorderPane.setMargin(btn4,new Insets(5, 0, 5, 0));
        
        root.setLeft(btn5);
        btn5.setMaxWidth(Double.MAX_VALUE);
        btn5.setMaxHeight(Double.MAX_VALUE);
        BorderPane.setMargin(btn5,new Insets(5, 0, 5, 0));
        */
        ////////////////////////////////////////////////////
        
        /* CREAR LOGIN */
        
        VBox containerLeft = new VBox();
        //AGREGAMOS NODOS HIJOS IZQUIERDA
        Label labelTitle = new Label("Iniciar Sesión");
        labelTitle.setFont(new Font(40));
        /*------------*********--------------*/
        VBox containerLogin = new VBox();
        //AGREGAMOS NODOS HIJOS LOGIN
        Label labelUser = new Label("Usuario:");
        labelUser.setFont(new Font(20)); 
        /*------------*********--------------*/
        Label labelPass = new Label("Contraseña");
        labelPass.setFont(new Font(20));
        //cuadros de texto
        TextField textUser = new TextField();
        textUser.setFont(new Font(18));
        textUser.setPromptText("Ingrese su usuario");
        textUser.setPrefHeight(50);
        textUser.setPrefWidth(44);
        //Pass
        PasswordField passField = new PasswordField();
        passField.setFont(new Font(18));
        passField.setPromptText("Ingrese su contraseña");
        passField.setPrefHeight(50);
        passField.setPrefWidth(44);
        
        //passField.setMaxWidth(150);
        //Boton de entrar
        Button btnLogin = new Button("ENTRAR");
        btnLogin.setFont(new Font(20));
        btnLogin.setPrefHeight(50);
        btnLogin.setPrefWidth(44);
        btnLogin.setMaxWidth(Double.MAX_VALUE);
        btnLogin.setCursor(Cursor.HAND); 
        
        containerLogin.getChildren().addAll(labelUser,textUser,labelPass,passField,btnLogin);
        containerLogin.setAlignment(Pos.TOP_LEFT);
        
        VBox.setMargin(labelUser, new Insets(10, 0, 0, 0));
        VBox.setMargin(labelPass, new Insets(10, 0, 0, 0));
        VBox.setMargin(btnLogin, new Insets(20, 0, 0, 0));
        
        containerLeft.getChildren().addAll(labelTitle, containerLogin);
        containerLeft.setPrefWidth(422);
        containerLeft.setAlignment(Pos.CENTER);
        VBox.setMargin(containerLogin, new Insets(0,30,0,30));
        
        VBox containerRight = new VBox();
        //AGREGAMOS NODOS HIJOS DERECHA
        ImageView imageLogo;
        
        InputStream inputStream;
        inputStream = getClass().getResourceAsStream("/Images/pok1.jpg");
        Image image = new Image(inputStream);
        
        imageLogo = new ImageView(image);
        containerRight.getChildren().add(imageLogo);
        
        
        containerRight.setPrefWidth(422);
        containerRight.setAlignment(Pos.CENTER);
        containerRight.setBackground(new Background(new BackgroundFill(Color.web("#A4A4A4"),CornerRadii.EMPTY,Insets.EMPTY)));
        
            
        HBox root = new HBox();
        root.getChildren().addAll(containerLeft,containerRight);
        HBox.setHgrow(containerLeft, Priority.ALWAYS);
        HBox.setHgrow(containerRight, Priority.ALWAYS);

//        VBox.setMargin(labelUser, new Insets(10, 0, 0, 0));
//        VBox.setMargin(labelPass, new Insets(10, 0, 0, 0));
//        VBox.setMargin(btnLogin, new Insets(10, 0, 0, 0));
        
        ////////////////////////////////////////////////////
        
        
        Scene scene = new Scene(root, 854, 503);
        
        primaryStage.setTitle("HBox Layout");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    
    
    @Override
    public void stop(){
         System.out.println("metodo stop() ");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
        
    }
    
}
