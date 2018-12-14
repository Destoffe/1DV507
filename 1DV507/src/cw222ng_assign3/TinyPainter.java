package cw222ng_assign3;
 
import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

public class TinyPainter extends Application{
	 //Temporary objects that i will add on the Pane
	 static Circle tempCircle;
	 static Rectangle tempRect;
	 static Line tempLine;
	 
	 //invisible rectangle that i use to save my currentPosition when i create the shape
	 Rectangle prevPos = new Rectangle(0,0,0,0);
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) {
		prevPos.setVisible(false);
		Pane paintPane = new Pane();
		HBox topPane = new HBox();
		topPane.setSpacing(5);
		
		//All data are saved in here, shapes, sizes, etc
		ComboBox<String> shapes = new ComboBox<String>();
		ComboBox<Integer> size = new ComboBox<Integer>();
		ColorPicker color = new ColorPicker();
	
		shapes.getItems().addAll("Circle","Rectangle","Line","Dot");
	
		size.getItems().addAll(1,2,4,6,8,10,12,14,16
				,18,20,22,24,26,28,30,32,34,36,38,40);
		size.getSelectionModel().selectFirst();
		shapes.getSelectionModel().selectFirst();
		
		topPane.getChildren().addAll(shapes,size,color);
		paintPane.setOnMousePressed(event -> {
				prevPos.setVisible(true);
				//Save the data of my currentPosition to have a position to go from
				prevPos.setTranslateX(event.getX());
				prevPos.setTranslateY(event.getY());
				// If the rectangle is highlighted create an Rectangle,Circle,Line,Etc
				if(shapes.getValue() == "Rectangle") {
					tempRect = new Rectangle();
					tempRect.setFill(color.getValue());
					tempRect.setTranslateX(event.getX());
					tempRect.setTranslateY(event.getY());
					paintPane.getChildren().addAll(tempRect);
				}else if(shapes.getValue() == "Circle") {
					tempCircle = new Circle();
					tempCircle.setFill(color.getValue());
					tempCircle.setTranslateX(event.getX());
					tempCircle.setTranslateY(event.getY());
					paintPane.getChildren().addAll(tempCircle);
				}else if(shapes.getValue() == "Line") {
					tempLine = new Line();
					tempLine.setStrokeWidth(size.getValue());
					tempLine.setStroke(color.getValue());;
					tempLine.setStartX(event.getX());
					tempLine.setStartY(event.getY());
					tempLine.setEndX(event.getX());
					tempLine.setEndY(event.getY());
					paintPane.getChildren().addAll(tempLine);
				}
				else if(shapes.getValue() == "Dot") {
					tempRect = new Rectangle();
					tempRect.setWidth(size.getValue());
					tempRect.setHeight(size.getValue());
					tempRect.setFill(color.getValue());
					tempRect.setTranslateX(event.getX()-size.getValue()/2);
					tempRect.setTranslateY(event.getY()-size.getValue()/2);
					paintPane.getChildren().addAll(tempRect);
				}
			});
		
		paintPane.setOnMouseDragged(event -> {
				topPane.toFront();
				if(shapes.getValue() == "Rectangle") {
					//Calculate the distance between the position the rectangle is being created in, minus the distance that the mouse currently is at
					tempRect.setWidth((event.getX() - prevPos.getTranslateX()));
					tempRect.setHeight((event.getY() - prevPos.getTranslateY()));
				}else if(shapes.getValue() == "Circle") {
					//Calculating the distance between the middle of the circle and the current mouse position with Pythagoras theorem
					double x = event.getX() - prevPos.getTranslateX();
					double y = event.getY() - prevPos.getTranslateY();
					double radius = Math.sqrt((Math.pow(x, 2)) + (Math.pow(y, 2)));
					tempCircle.setRadius(radius);
				}
				else if(shapes.getValue() == "Line") {
					//Setting the end position of the line as my current mouse position
					tempLine.setEndX((event.getX()));
					tempLine.setEndY((event.getY()));
				}
			});

		paintPane.getChildren().addAll(topPane);
		Scene scene = new Scene(paintPane,800,650);
		primaryStage.setTitle("Tiny Painter");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	


}
