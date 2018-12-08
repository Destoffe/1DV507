package cw222ng_assign3;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Exercise10 extends Application {

	public double x_speed;
	public double y_speed;
	final int width = 600;
	final int height = 400;
	public int currentFrame = 0;
	public int currentRotation = 0;
	
	public static void main(String[] args) {
		launch(args);
	}
	public void start(Stage primaryStage) {
		x_speed = 4;
		y_speed = 4;
		Image[] runAnimation = new Image[11];
		Group root = new Group();
		Scene scene = new Scene(root,width,height);
		runAnimation[0] =new Image ("cw222ng_assign3\\Assets\\run1.png");
		runAnimation[1] =new Image ("cw222ng_assign3\\Assets\\run2.png");
		runAnimation[2] =new Image ("cw222ng_assign3\\Assets\\run3.png");
		runAnimation[3] =new Image ("cw222ng_assign3\\Assets\\run4.png");
		runAnimation[4] =new Image ("cw222ng_assign3\\Assets\\run5.png");
		runAnimation[5] =new Image ("cw222ng_assign3\\Assets\\run6.png");
		runAnimation[6] =new Image ("cw222ng_assign3\\Assets\\run7.png");
		runAnimation[7] =new Image ("cw222ng_assign3\\Assets\\run8.png");
		runAnimation[8] =new Image ("cw222ng_assign3\\Assets\\run9.png");
		runAnimation[9] =new Image ("cw222ng_assign3\\Assets\\run10.png");
		runAnimation[10] =new Image ("cw222ng_assign3\\Assets\\run11.png");
		
		ImageView ground = new ImageView(new Image("cw222ng_assign3\\Assets\\tiles.png"));
		ImageView santa = new ImageView(new Image("cw222ng_assign3\\Assets\\run1.png"));
		ImageView bg = new ImageView(new Image("cw222ng_assign3\\Assets\\BG.png"));
		
		santa.setFitWidth(100.0);
		santa.setPreserveRatio(true);
		santa.setX(100);
		santa.setY(height -187);
		santa.setRotationAxis(Rotate.Y_AXIS);
		
		ground.setFitWidth(width);
		ground.setFitHeight(height/2);
		ground.setPreserveRatio(false);
		ground.setX(0);
		ground.setY(height -192);

		root.getChildren().addAll(bg,ground,santa);
		primaryStage.setTitle("Christmas man");
		
		KeyFrame k = new KeyFrame(Duration.millis(32),event ->{
			santa.setX(santa.getX() + x_speed);
			santa.setImage(runAnimation[currentFrame]);
			currentFrame++;
			if(currentFrame>10)
				currentFrame =0;
			if(santa.getX() <=-25 || santa.getX() >= width -75) {
				x_speed = -x_speed;
				santa.setRotate(currentRotation+=180);
			}
		});
		
		Timeline t = new Timeline(k);
		t.setCycleCount(Timeline.INDEFINITE);
		t.play();
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
