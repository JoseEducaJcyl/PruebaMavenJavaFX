package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

//Clase main
public class Main extends Application {
    //Metodo start
    public void start(Stage primaryStage) throws Exception {
        //Boton con un evento para imprimir por consola
        Button button = new Button("Haz click aqui");
        button.setOnAction(event -> {
            System.out.println("Has pulsado...");
        });
        //Escena para crear la ventana con el boton y mostrarla
        Scene scene = new Scene(button, 300, 200);
        primaryStage.setTitle("Aplicacion click en boton");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    //Metodo main para ejecutar el programa
    public static void main(String[] args) {
        //Metodo launch para lanzar la ventana
        launch(args);
    }
}
