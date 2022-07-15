package application;

//import javafx.application.Application;
//import javafx.stage.Stage;
//import javafx.*;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
//import javafx.scene.layout.HBox;
//import javafx.scene.control.Label;

/**
 *  A simple JavaFX GUI application
 */

public class MyFirstGUI extends Application
{
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Set the window's title.
      primaryStage.setTitle("My First GUI Application");
      
      // Show the window.
      primaryStage.show();
   }
}

