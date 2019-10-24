package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.InputStream;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        //adjust stage properties
        primaryStage.setScene(new Scene(root, 300, 275));

        primaryStage.setTitle("Solar Car Telemetry");

        //add icon
        InputStream iconStream = getClass().getResourceAsStream("/icon.png");
        Image image = new Image(iconStream);
        primaryStage.getIcons().add(image);

        //add label
        Label titleLabel = new Label("Solar Car Telemetry");
        Scene primaryScene = new Scene(titleLabel);
        titleLabel.setAlignment(Pos.TOP_CENTER);

        primaryStage.setScene(primaryScene);

        //show stage
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
