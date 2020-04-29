package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Creating a line object
        Line line = new Line();

        //Setting the properties to a line
        line.setStartX(100.0);
        line.setStartY(150.0);
        line.setEndX(600.0);
        line.setEndY(150.0);

        //Creating a Group
        Group root = new Group(line);

        //Creating a Scene
        Scene scene = new Scene(root, 600, 300);

        //Setting title to the scene
        primaryStage.setTitle("Sample");

        //Adding the scene to the stage
        primaryStage.setScene(scene);

        //Displaying the contents of a scene
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
