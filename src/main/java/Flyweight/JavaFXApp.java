package Flyweight;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFXApp extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Tile Map");

        Map cityMap = new CityMap();
        GridPane gridPane = cityMap.display(1000, 1000);

        StackPane root = new StackPane();
        root.getChildren().add(gridPane);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}
