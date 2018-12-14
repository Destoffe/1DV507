package cw222ng_assign2.Graphics;

 
import java.io.FileInputStream; 
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;

import javax.imageio.stream.FileImageInputStream;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group; 
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;
import javafx.stage.Stage;  


public class Yahtzee extends Application {
	int rollsLeft = 3;
	int randomNum[] = new int[5];
	Random rand = new Random();
	ImageView diceView1;
	ImageView diceView2;
	ImageView diceView3;
	ImageView diceView4;
	ImageView diceView5;
	ImageView diceView6;
	int check = 0;
	boolean pairs = false;
	boolean threeOfAKind = false;
	boolean firstRound = true;
	boolean fourOfAKind = false;
	boolean yatzy = false;
	boolean smallStraight = false;
	boolean largeStraight = false;
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {


		int height= 250;
		int width = 400;
		Group root = new Group();
		Image dices[];
		Label yatz = new Label("Yahtzee");
		Label rollsLeftText = new Label("You have " + rollsLeft + " left!");
		dices = new Image[6];
		dices[0] = new Image("cw222ng_assign2\\pictures\\dice2.png");
		dices[1] = new Image("cw222ng_assign2\\pictures\\dice2.png");
		dices[2] = new Image("cw222ng_assign2\\pictures\\dice3.png");
		dices[3] = new Image("cw222ng_assign2\\pictures\\dice4.png");
		dices[4] = new Image("cw222ng_assign2\\pictures\\dice5.png");
		dices[5] = new Image("cw222ng_assign2\\pictures\\dice6.png");

		CheckBox cb1 = new CheckBox();
		CheckBox cb2 = new CheckBox();
		CheckBox cb3 = new CheckBox();
		CheckBox cb4 = new CheckBox();
		CheckBox cb5 = new CheckBox();

		diceView1 = new ImageView(dices[0]);
		diceView2 = new ImageView(dices[1]);
		diceView3 = new ImageView(dices[2]);
		diceView4 = new ImageView(dices[3]);
		diceView5 = new ImageView(dices[4]);
		diceView6 = new ImageView(dices[5]);

		Button button = new Button("Roll the dice!");
		root.getChildren().add(cb1);
		root.getChildren().add(cb2);
		root.getChildren().add(cb3);
		root.getChildren().add(cb4);
		root.getChildren().add(cb5);

		root.getChildren().add(yatz);
		root.getChildren().add(diceView1);
		root.getChildren().add(diceView2);
		root.getChildren().add(diceView3);
		root.getChildren().add(diceView4);
		root.getChildren().add(diceView5);

		root.getChildren().add(button);
		root.getChildren().add(rollsLeftText);
		diceView1.setX(10);
		diceView2.setX(64 + 10);
		diceView3.setX((64 *2) + 10 );
		diceView4.setX((64 *3) + 10);
		diceView5.setX((64 *4) + 10);
		diceView5.setX((64 *4) + 10);
		diceView1.setY(64);
		diceView2.setY(64);
		diceView3.setY(64);
		diceView4.setY(64);
		diceView5.setY(64);
		diceView5.setY(64);

		cb1.setLayoutY(64*2 + 5);
		cb1.setLayoutX(32);

		cb2.setLayoutY(64*2 + 5);
		cb2.setLayoutX(32 + 64);

		cb3.setLayoutY(64*2 + 5);
		cb3.setLayoutX(32 +64*2);

		cb4.setLayoutY(64*2 + 5);
		cb4.setLayoutX(32 +64 *3);

		cb5.setLayoutY(64*2 + 5);
		cb5.setLayoutX(32 +64 *4);

		cb1.setDisable(true);
		cb2.setDisable(true);
		cb3.setDisable(true);
		cb4.setDisable(true);
		cb5.setDisable(true);

		yatz.setFont(new Font(30));

		rollsLeftText.setLayoutX(125);
		rollsLeftText.setLayoutY(height-45);

		button.setLayoutX(25);
		button.setLayoutY(height -50);
		button.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if(!firstRound && rollsLeft>=1){
					if(!cb1.isSelected()){
						randomNum[0] = rand.nextInt(6);
						diceView1.setImage((dices[randomNum[0]]));
					}
					if(!cb2.isSelected()){
						randomNum[1] = rand.nextInt(6);
						diceView2.setImage((dices[randomNum[1]]));
					}
					if(!cb3.isSelected()){
						randomNum[2] = rand.nextInt(6);
						diceView3.setImage((dices[randomNum[2]]));
					}
					if(!cb4.isSelected()){
						randomNum[3] = rand.nextInt(6);
						diceView4.setImage((dices[randomNum[3]]));
					}
					if(!cb5.isSelected()){
						randomNum[4] = rand.nextInt(6);
						diceView5.setImage((dices[randomNum[4]]));
					}
					rollsLeft--;
				}
				if(firstRound){
					for(int i=0; i<5; i++){
						randomNum[i] = rand.nextInt(6);
					}
					diceView1.setImage((dices[randomNum[0]]));
					diceView2.setImage((dices[randomNum[1]]));
					diceView3.setImage((dices[randomNum[2]]));
					diceView4.setImage((dices[randomNum[3]]));
					diceView5.setImage((dices[randomNum[4]]));
					cb1.setDisable(false);
					cb2.setDisable(false);
					cb3.setDisable(false);
					cb4.setDisable(false);
					cb5.setDisable(false);
					firstRound = false;
					rollsLeft--;
				}
				rollsLeftText.setText("You have " + rollsLeft + " left!");
				if(rollsLeft==0){
					Arrays.sort(randomNum);

					System.out.println(Arrays.toString(randomNum));
					for(int i=0; i<5; i++){
						if(i+1 <5)
							if(randomNum[i] == randomNum[i+1]){
								check++;
								
								if(check ==1){
									pairs = true;
									if(i+2 <5)
										if(randomNum[i+1] != randomNum[i+2]){
											check = 0;
										}
								}

								else if(check ==2){
									if(randomNum[0] != randomNum[1] || randomNum[4] != randomNum[3] ||( randomNum[4] != randomNum[0] &&randomNum[0] != randomNum[1] )) 
										pairs = false;
									
									threeOfAKind = true;
									if(i+2 <5)
										if(randomNum[i+1] != randomNum[i+2]){
											check = 0;
										}
								}
								else if(check ==3){
									fourOfAKind = true;
									if(i+2 <5)
										if(randomNum[i+1] != randomNum[i+2]){
											check = 0;
										}
								}
								else if(check ==4){
									yatzy = true;
									if(i+2 <5)
										if(randomNum[i+1] != randomNum[i+2]){
											check = 0;
										}
								}
							}
							else {
								check = 0;
							}
					}
					int straightCheck =0;
					for(int i=0; i<5; i++){
						if(i+1 <5)
							if(randomNum[i]+1 == randomNum[i+1]){
								straightCheck++;

							}else if(randomNum[i] == randomNum[i+1]){

							}
							else{
								straightCheck =0;
							}
					}
					if(straightCheck ==3)
						smallStraight= true;
					else if(straightCheck == 4)
						largeStraight = true;
				}
				if(pairs){
					rollsLeftText.setText("Pairs!");	 
				}
				if(threeOfAKind) {
					rollsLeftText.setText("ThreeOfAKind");	 
				}
				if(fourOfAKind){
					rollsLeftText.setText("FourOfAKind");	 
				}
				if(threeOfAKind && pairs ){
					rollsLeftText.setText("Full house!");	 
				}
				if(smallStraight ){
					rollsLeftText.setText("Smallstraight!");	 
				}
				if(largeStraight ){
					rollsLeftText.setText("LargeStraight!");	 
				}
				if(yatzy){
					rollsLeftText.setText("Yatzhee");	 
				}
			}

		});
		Scene scene = new Scene(root, width, height);
		primaryStage.setTitle("Yahtzee");
		primaryStage.setScene(scene); 
		primaryStage.show();
	}
}
