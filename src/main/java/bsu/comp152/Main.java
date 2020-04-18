package bsu.comp152;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.text.Font;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        var box = new VBox();
        var tag = new Label("Hello World");
        var tag2 = new Label("Enter a word!");
        var firstScene = new Scene(box);
        box.getChildren().add(tag); // first thing added to the box
        box.getChildren().add(tag2);
        primaryStage.setScene(firstScene);
        primaryStage.setTitle("Multiple Controls Visible");
        var color = Paint.valueOf("Red");
        var background = Paint.valueOf("cyan");
        var face = Font.font(32);
        tag.setFont(face);
        tag.setTextFill(color);
        tag2.setFont(face);
        Button pushbutton = new Button("Push ME");
        box.getChildren().add(pushbutton); //second thing added to the box
        var input = new TextField();
        input.setFont(face);
        pushbutton.setFont(face);
        EventHandler<ActionEvent> responder = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                var inputText = input.getText();   //INPUT HAS TO BE ABOVE
                tag.setText(inputText); // changes dillonh world to whatever the text is


            }
        };       //needs a semi-colon
        pushbutton.setOnAction(responder);
        box.getChildren().add(input);

        tag.setBackground(new Background(new BackgroundFill(background, CornerRadii.EMPTY, Insets.EMPTY)));      primaryStage.setMinHeight(300);
        primaryStage.setMinWidth(300);
        primaryStage.show();
    }

    //@Override
    //public static Font(setFont)
}
