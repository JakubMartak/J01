package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group root = new Group();
        Scene scene = new Scene(root, 720,406);
        scene.setFill(Color.BLACK);
        primaryStage.setTitle("witcher.jpg");
        Line line1 = new Line(103,173,142,173);
        Line line2 = new Line(130,191,142,173);
        Line line3 = new Line(103,173,142,223);
        Line line4 = new Line(142,223,103,223);
        Line line5 = new Line(113,209,103,223);
        Line line6 = new Line(218,173,269,173);
        Line line7 = new Line(218,173,244,223);
        Line line8 = new Line(252,209,244,223);
        Line line9 = new Line(262,189,269,173);
        Line line10 = new Line(262,189,248,189);
        Line line11 = new Line(366,173,339,223);
        Line line12 = new Line(390,223,339,223);
        Line line13 = new Line(390,223,375,194);
        Line line14 = new Line(514,173,460,173);
        Line line15 = new Line(460,173,486,223);
        Line line16 = new Line(505,191,486,223);
        Line line17 = new Line(580,223,634,223);
        Line line18 = new Line(607,173,634,223);
        Line line19 = new Line(607,173,598,189);
        Line line20 = new Line(580,223,591,204);
        Line line21 = new Line(607,204,591,204);
        line1.setStroke(Color.PURPLE);
        line2.setStroke(Color.PURPLE);
        line3.setStroke(Color.PURPLE);
        line4.setStroke(Color.PURPLE);
        line5.setStroke(Color.PURPLE);
        line6.setStroke(Color.YELLOW);
        line7.setStroke(Color.YELLOW);
        line8.setStroke(Color.YELLOW);
        line9.setStroke(Color.YELLOW);
        line10.setStroke(Color.YELLOW);
        line11.setStroke(Color.RED);
        line12.setStroke(Color.RED);
        line13.setStroke(Color.RED);
        line14.setStroke(Color.GREEN);
        line15.setStroke(Color.GREEN);
        line16.setStroke(Color.GREEN);
        line17.setStroke(Color.TURQUOISE);
        line18.setStroke(Color.TURQUOISE);
        line19.setStroke(Color.TURQUOISE);
        line20.setStroke(Color.TURQUOISE);
        line21.setStroke(Color.TURQUOISE);
        line1.setStrokeWidth(5);
        line2.setStrokeWidth(5);
        line3.setStrokeWidth(5);
        line4.setStrokeWidth(5);
        line5.setStrokeWidth(5);
        line6.setStrokeWidth(5);
        line7.setStrokeWidth(5);
        line8.setStrokeWidth(5);
        line9.setStrokeWidth(5);
        line10.setStrokeWidth(5);
        line11.setStrokeWidth(5);
        line12.setStrokeWidth(5);
        line13.setStrokeWidth(5);
        line14.setStrokeWidth(5);
        line15.setStrokeWidth(5);
        line16.setStrokeWidth(5);
        line17.setStrokeWidth(5);
        line18.setStrokeWidth(5);
        line19.setStrokeWidth(5);
        line20.setStrokeWidth(5);
        line21.setStrokeWidth(5);
        root.getChildren().add(line1);
        root.getChildren().add(line2);
        root.getChildren().add(line3);
        root.getChildren().add(line4);
        root.getChildren().add(line5);
        root.getChildren().add(line6);
        root.getChildren().add(line7);
        root.getChildren().add(line8);
        root.getChildren().add(line9);
        root.getChildren().add(line10);
        root.getChildren().add(line11);
        root.getChildren().add(line12);
        root.getChildren().add(line13);
        root.getChildren().add(line14);
        root.getChildren().add(line15);
        root.getChildren().add(line16);
        root.getChildren().add(line17);
        root.getChildren().add(line18);
        root.getChildren().add(line19);
        root.getChildren().add(line20);
        root.getChildren().add(line21);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
