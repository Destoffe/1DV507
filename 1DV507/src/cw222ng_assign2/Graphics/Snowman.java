package cw222ng_assign2.Graphics;
 
import java.awt.geom.Rectangle2D;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.*;

public class Snowman extends Application {
	    public static void main(String[] args) {
	        launch(args);
	    }

		@Override
		public void start(Stage primaryStage) throws Exception {
			
			
			
			Group root = new Group();
			
			//World hight and width
			int width = 600;
			int height = 600;
			//Size Variables
			int bottomRadius = 80;
			int middleRadius = 55;
			int topRadius = 25;
			int snowmanOffset = 15;
			int buttonRadius = 5;
			int sunOffset = 25;
			
			
			Circle bottomCircle = new Circle();
			Circle middleCircle = new Circle();
			Circle topCircle = new Circle();
			Circle button1 = new Circle();
			Circle button2 = new Circle();
			Circle button3 = new Circle();
			Circle leftEye = new Circle();
			Circle rightEye = new Circle();
			Circle sun = new Circle();
			Rectangle background = new Rectangle();
			Rectangle ground = new Rectangle();
			Rectangle mouth = new Rectangle();
			
			root.getChildren().add(background);
			root.getChildren().add(ground);
			root.getChildren().add(bottomCircle);
			root.getChildren().add(middleCircle);
			root.getChildren().add(topCircle);
			root.getChildren().add(button1);
			root.getChildren().add(button2);
			root.getChildren().add(button3);
			root.getChildren().add(leftEye);
			root.getChildren().add(rightEye);
			root.getChildren().add(mouth);
			root.getChildren().add(sun);
			
			background.setX(0);
			background.setWidth(width);
			background.setHeight(height);
			background.setFill(Color.BLUE);
			
			ground.setX(0);
			ground.setY(height-75);
			ground.setWidth(width);
			ground.setHeight(75);
			ground.setFill(Color.WHITE);
			
			mouth.setX((width/2) -10);
			mouth.setY(height-(bottomRadius) - (middleRadius*2) - (topRadius*3) - snowmanOffset+10);
			mouth.setWidth(20);
			mouth.setHeight(2);
			mouth.setFill(Color.BLACK);
			
			//Button1 circle stats
			button1.setRadius(buttonRadius);
			button1.setCenterY(height-(bottomRadius) - (middleRadius*2)-snowmanOffset);
			button1.setCenterX(width/2);
			button1.setFill(Color.BLACK);
			//Button2 circle stats
			button2.setRadius(buttonRadius);
			button2.setCenterY(height-(bottomRadius) - (middleRadius*2)-snowmanOffset + 20);
			button2.setCenterX(width/2);
			button2.setFill(Color.BLACK);
			//Button2 circle stats
			button3.setRadius(buttonRadius);
			button3.setCenterY(height-(bottomRadius) - (middleRadius*2)-snowmanOffset - 20);
			button3.setCenterX(width/2);
			button3.setFill(Color.BLACK);
			
			//Button2 circle stats
			leftEye.setRadius(buttonRadius);
			leftEye.setCenterY(height-(bottomRadius) - (middleRadius*2) - (topRadius*3) - snowmanOffset-10);
			leftEye.setCenterX(width/2 - 10);
			leftEye.setFill(Color.BLACK);
			//Button2 circle stats
			rightEye.setRadius(buttonRadius);
			rightEye.setCenterY(height-(bottomRadius) - (middleRadius*2) - (topRadius*3) - snowmanOffset-10);
			rightEye.setCenterX(width/2 + 10);
			rightEye.setFill(Color.BLACK);
			
			//Bottom circle stats
			bottomCircle.setRadius(bottomRadius);
			bottomCircle.setCenterY(height-(bottomRadius)-snowmanOffset);
			bottomCircle.setCenterX(width/2);
			bottomCircle.setFill(Color.WHITE);
			
			//Middle circle stats
			middleCircle.setRadius(middleRadius);
			middleCircle.setCenterY(height-(bottomRadius) - (middleRadius*2)-snowmanOffset);
			middleCircle.setCenterX(width/2);
			middleCircle.setFill(Color.WHITE);
			
			//Top circle stats
			topCircle.setRadius(topRadius);
			topCircle.setCenterY(height-(bottomRadius) - (middleRadius*2) - (topRadius*3) - snowmanOffset);
			topCircle.setCenterX(width/2);
			topCircle.setFill(Color.WHITE);
			//Middle circle stats
			sun.setRadius(middleRadius);
			sun.setCenterY(sunOffset+ middleRadius);
			sun.setCenterX(width - sunOffset - middleRadius );
			sun.setFill(Color.YELLOW);
			
			
			Scene scene = new Scene(root, width, height);
			primaryStage.setTitle("Snowman");
			primaryStage.setScene(scene); 
			primaryStage.show();
		}

}
