package sample;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        //Creating a Text object
        Text text = new Text();

        //Setting font to the text
        text.setFont(new Font(61));

        //setting the position of the text
        text.setX(50);
        text.setY(150);

        //Setting the text to be added.
        text.setText("Welcome");

        //Creating a Group object
        Group root = new Group(text);

//        //Retrieving the observable list object
//        ObservableList list = root.getChildren();
//
//        //Setting the text object as a node to the group object
//        list.add(text);

        //Creating a scene object
        Scene scene = new Scene(root, 600, 300);

        //Setting title to the Stage
        primaryStage.setTitle("Sample");

        //Adding scene to the stage
        primaryStage.setScene(scene);

        //Displaying the contents of the stage
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
