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
        primaryStage.setTitle("Feedback Application");
        primaryStage.setScene(new Scene(root));
        root.getStylesheets().add(getClass().getResource("sample.css").toExternalForm());
        primaryStage.show();
        Image img=new Image("feedback.png");
        primaryStage.getIcons().add(img);



    }


    public static void main(String[] args) {
        launch(args);
    }
}
