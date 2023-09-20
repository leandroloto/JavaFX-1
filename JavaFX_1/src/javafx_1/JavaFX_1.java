/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx_1;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
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
        
        Button btn = new Button();
        btn.setText("Say, 'Hello World!'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
        
            @Override
            public void handle(ActionEvent event){
                Platform.exit();
        }
        }); 
        
        //Label label = new Label("Hola mundo cruel!"); 
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);

        
        primaryStage.setTitle("JAVA FX"); 
        primaryStage.setScene(scene);
        primaryStage.show();
        
        System.out.println("metodo init() ");
    
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
