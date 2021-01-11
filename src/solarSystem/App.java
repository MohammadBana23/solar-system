package solarSystem;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.awt.*;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        paneOrganizer organizer = new paneOrganizer();
        Scene scene = new Scene(organizer.getRoot(),1900,1000);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Solar System");
        primaryStage.setMaximized(true);
        primaryStage.show();

    }
}
