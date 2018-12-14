package cw222ng_assign2.Graphics;
 
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.*;

public class CompundInteret extends Application {
	
	float startAmount, yearsAmount, interestAmount;
	int resultAmount;
	    public static void main(String[] args) {
	        launch(args);
	    }

		@Override
		public void start(Stage primaryStage) throws Exception {
			Group root = new Group();
			Text text = new Text("Compound interest");
			Label startAmountText = new Label("Start Amount:");
			TextField amountField = new TextField ();
			Label interest = new Label("Interest:");
			TextField interestField = new TextField ();
			Label years = new Label("Number of years:");
			TextField yearsField = new TextField ();
			Button button = new Button("Calculate");
			HBox hb1 = new HBox();
			HBox hb2 = new HBox();
			HBox hb3 = new HBox();
			Label result = new Label("");
			
			root.getChildren().add(text);
			root.getChildren().add(hb1);
			root.getChildren().add(hb2);
			root.getChildren().add(hb3);
			root.getChildren().add(button);
			root.getChildren().add(result);
			// World settings
			int width = 300;
			int height = 300;
			
			// Calculate variables
			
			
			
			text.setFont(new Font(20));
			text.setY(25);
			text.setX(width/5);
			

			hb1.getChildren().addAll(startAmountText, amountField);
			hb1.setSpacing(25);
			hb1.setLayoutX(10);
			hb1.setLayoutY(height/2 -50);
			
			hb2.getChildren().addAll(interest, interestField);
			hb2.setSpacing(60);
			hb2.setLayoutX(10);
			hb2.setLayoutY(height/2);
			
			hb3.getChildren().addAll(years, yearsField);
			hb3.setSpacing(5);
			hb3.setLayoutX(10);
			hb3.setLayoutY(height/2 + 50);
			
			button.setLayoutX(10);
			button.setLayoutY(height - 75);
			
			button.setOnAction(new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent event) {
	            	startAmount = Float.parseFloat(amountField.getText());
	            	yearsAmount = Float.parseFloat(yearsField.getText());
	            	interestAmount = Float.parseFloat(interestField.getText());
	            	
	            	resultAmount = (int) (startAmount * (Math.pow(1.0f + (interestAmount/100.0f),yearsAmount)));
	            	
	                result.setText("The result is: " + resultAmount);

	            }
	        });
			
			result.setLayoutX(10);
			result.setLayoutY(height-50);
			
			
			Scene scene = new Scene(root, width, height);
			primaryStage.setTitle("Compund Interest");
			primaryStage.setScene(scene); 
			primaryStage.show();
			
		}


}
