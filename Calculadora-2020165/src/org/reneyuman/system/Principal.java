/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.reneyuman.system;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author Alejandro
 */
public class Principal extends Application {
    
    @Override
    public void start(Stage escenarioPrincipal) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        escenarioPrincipal.setTitle("Programador: Rene Alejandro Yuman Barco");
        escenarioPrincipal.getIcons().add (new Image("/org/reneyuman/images/Calcicon2.png"));
        escenarioPrincipal.setScene(scene);
        escenarioPrincipal.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
    
}
