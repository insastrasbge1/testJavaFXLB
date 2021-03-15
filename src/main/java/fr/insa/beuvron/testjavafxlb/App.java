package fr.insa.beuvron.testjavafxlb;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        Scene sc = new Scene(new BoiteACoucou());
        stage.setScene(sc);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}