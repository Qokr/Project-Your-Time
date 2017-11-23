package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene scene = new Scene(root);
        
        scene.getStylesheets().add("styles/style.css");
        primaryStage.setScene(scene);
        primaryStage.setTitle("Your Time");
        primaryStage.getIcons().add(new Image("/img/Icon.jpg"));
        primaryStage.setMaxHeight(400);
        primaryStage.setMaxWidth(600);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
