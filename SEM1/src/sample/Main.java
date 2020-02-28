package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group root = new Group();
        Scene scene = new Scene(root, 600,400);
        TextField t1 = new TextField();
        Button b1 = new Button("Vypíš");
        t1.setLayoutX(0);
        t1.setLayoutY(25);
        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int r = 0;
                int g = 0;
                int b = 0;
                String text = t1.getText();
                for (int i = 0; i < text.length(); i++) if (text.charAt(i) == 'A' || text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'E' || text.charAt(i) == 'i' || text.charAt(i) == 'I' || text.charAt(i) == 'o' || text.charAt(i) == 'O' || text.charAt(i) == 'u' || text.charAt(i) == 'U' || text.charAt(i) == 'y' || text.charAt(i) == 'Y' || text.charAt(i) == 'ä' || text.charAt(i) == 'Á' || text.charAt(i) == 'á' || text.charAt(i) == 'é' || text.charAt(i) == 'É' || text.charAt(i) == 'í' || text.charAt(i) == 'Í' || text.charAt(i) == 'ó' || text.charAt(i) == 'Ó' || text.charAt(i) == 'ú' || text.charAt(i) == 'Ú' || text.charAt(i) == 'ý' || text.charAt(i) == 'Ý') {
                    r++;
                    b++;
                }
                else if (Character.isLetter(text.charAt(i))){
                    g++;
                    b++;
                }
                scene.setFill(Color.rgb(r*16,g*24,(b%25)*10));
            }
        });
        root.getChildren().addAll(t1,b1);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
