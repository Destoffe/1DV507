package cw222ng_assign3;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class NorseGods extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}
	
	public void start(Stage primaryStage) {
		
		//Data to store name,races,desc etc.
		final ArrayList<String>godNames = new ArrayList<>();
		final ArrayList<String>races = new ArrayList<>();
		final ArrayList<String>desc = new ArrayList<>();
		final ArrayList<NorseGod>gods = new ArrayList<>();
		ListView<String> godList = new ListView<>();
		ScrollPane sp = new ScrollPane();
		BorderPane layout = new BorderPane();
		Text tempDesc = new Text();
		Text tempRace = new Text();
		Text tempName = new Text();
		TextField textField = new TextField ();
		TextFlow textFlow = new TextFlow(tempName,tempRace,tempDesc);
		Text title = new Text("Norse Gods and other Beings");
		// Creating gods with the arguments Name,Race,Description. Descriptions taken from http://thenorsegods.com/the-norse-gods/
		gods.add(new NorseGod("Aegir","Giant","Aegir is the god of the sea in Norse mythology. He was both worshipped and feared by sailors, for they believed that Aegir would occasionally appear on the surface to take ships, men and cargo alike, with him to his hall at the bottom of the ocean. Sacrifices were made to appease him, particularly prisoners before setting sail.\r\n" + "\r\n" + "His wife is the sea goddess Ran with whom he has nine daughters (the billow maidens), who wore white robes and veils. His two faithful servants are Eldir and Fimafeng. The latter was killed by the treacherous god Loki during a banquet the gods held at Aegir’s undersea hall near the island of Hler (or Hlesey). Aegir was known for the lavish entertainment he gave to the other gods."));
		gods.add(new NorseGod("Frigga","Asynjorna","Frigga (Frigg, Fricka), Odin’s wife, was considered to be the Mother of all; and protector of children. She spins the sacred Distaff of life, and is said to know the future, although she will not speak of it. Some believe that Friday was named for her instead of Freya, and there is considerable confusion as to “who does what” among the two. The Norns (Urd, Verdande, and Skuld), are the Norse equivalent of the greek Fates. It is they who determine the orlogs (destinies) of the Gods and of Man, and who maintain the World Tree, Yggdrasil."));
		gods.add(new NorseGod("Balder","Asgard","Balder, son of Odin and Frigga, the god of Love and Light, is sacrificed at Midsummer by the dart of the mistletoe, and is reborn at Jul (Yule). Supposedly his return will not occur until after the onslaught of the Ragnarok, which I see as a cleansing and enlightenment more than wanton, purposeless destruction. Balder’s blind brother Hodur was his slayer, whose hand was guided by the crafty Loki. He is married to the goddess of Joy, Nanna.\r\n" + 		"\r\n" + 	"Balder’s dreams are the beginning of the end. He dreams of his own death and shows Loki the truly evil god that he is which shows the ultimate limitations and mortality of the gods. The gods capture and punish Loki but they cannot rescue Balder from Hel and the beautiful, passive god who embodies the qualities of mercy and love is lost to them. This is the beginning of the end, the first step towards Ragnarok begins."));
		gods.add(new NorseGod("Bor","Human","Bor is a primordial Norse man, the son of Buri. He married the giantess Bestla, who is a daughter of the frost giant Bolthorn. Bor and Bestla had three children who became the first gods: Odin, Vili, Ve."));
		gods.add(new NorseGod("Bragi","Human","The god of eloquence and poetry, and the patron of skalds (poets) in Norse mythology. He is regarded as a son of Odin and Frigga. Runes were carved on his tongue and he inspired poetry in humans by letting them drink from the mead of poetry. Bragi is married to Idun, the goddess of eternal youth. Oaths were sworn over the Bragarfull (“Cup of Bragi”), and drinks were taken from it in honor of a dead king. Before a king ascended the throne, he drank from such a cup.\r\n" + "\r\n" + "Note: Originally, Bragi did not belong the pantheon of gods. He was a poet from the 9th century, Bragi Boddason. Poets from later centuries made him a god."));
		gods.add(new NorseGod("Buri","Human","Buri is the primeval man in Norse mythology. He had neither father nor mother, but was created by a cow named Audhumla. As she licked the salt blocks of Ginnagagap, the shape of a man — Buri — was formed. Buri had a son named Bor. Bor had three sons who were gods: Odin, Vili, and Ve."));
		gods.add(new NorseGod("Forseti","Human","In Norse mythology, Forseti is the god of justice. He is the son of the god Balder and his mother is Nanna. He rules in the beautiful palace Glitnir with its pillars of red gold and its roof with inlaid silver, which serves as a court of justice and where all legal disputes are settled. See Myth 12 The Lay of Grimnir.\r\n" + "\r\n" + "Although Forseti is one of the twelve leading gods, he is not featured significantly in any of the surviving myths.\r\n" + "\r\n" + "He can be compared with the Teutonic god Fosite, who was worshipped on Helgoland a small Island in the North Sea."));
		gods.add(new NorseGod("Freyja","Human","Freyja (modern forms of the name include Freya, Freja, Freyia, Frøya, and Freia) is considered to be the goddess of Love and Beauty, but is also a warrior goddess and one of great wisdom and magick. She and her twin brother Freyr are of a different “race” of gods known as the Vanir. Many of the tribes venerated her higher than the Aesir, calling her “the Frowe” or “The Lady.” She is known as Queen of the Valkyries, choosers of those slain in battle to bear them to Valhalla (the Norse heaven). She, therefore, is a psychopomp like Odhinn and it is said that she gets the “first pick” of the battle slain. She wears the sacred necklace Brisingamen, which she paid for by spending the night with the dwarves who wrought it from the bowels of the earth. The cat is her sacred symbol. There seems to be some confusion between herself and Frigga, Odin’s wife, as they share similar functions; but Frigga seems to be strictly of the Aesir, while Freyja is of the Vanic race. The day Friday (Frejyasdaeg) was named for her (some claim it was for Frigga)."));
		
		//Always have the scrollbar available and make the scrollpane with the Bordepanes size
		sp.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		sp.setFitToHeight(true);
		sp.setFitToWidth(true);
		//Adding data from all the available gods
		for(int i=0; i<gods.size(); i++) {
			godNames.add(gods.get(i).getName());
			desc.add(gods.get(i).getDesc());
			races.add(gods.get(i).getRace());
		}

	
		// Adding some padding to get some distance between objects
		layout.setPadding(new Insets(10,20,10,0));
		//Setting size to fit 8 gods at start, with increase if more is added
		godList.setPrefWidth(150);
		godList.setPrefHeight(100);
		godList.getItems().addAll(godNames);
		
		// Temporary text objects to display the race/name/desc in the TextFlow that is inside the ScrollPane

		tempRace.setFont(Font.font("Verdana",FontPosture.ITALIC,11));
		tempName.setFont(Font.font("Verdana", FontWeight.BOLD,12));
		
	
		// Listening to mouseclicks and making it a selectionmodel with an index type so i can easily display the right info on the right click
		godList.getSelectionModel().selectedIndexProperty().addListener(ov ->{
			tempName.setText("Name: " + godNames.get(godList.getSelectionModel().getSelectedIndex())+ "\n");
			tempRace.setText("Race: " + races.get(godList.getSelectionModel().getSelectedIndex())+ "\n" + "\n");
			tempDesc.setText(desc.get(godList.getSelectionModel().getSelectedIndex()));
		});


		title.setFont(Font.font("Verdana",FontWeight.BOLD,20));
		textFlow.setPadding(new Insets (10,20,10,20));
		sp.setContent(textFlow);
		layout.setCenter(sp);
		layout.setTop(title);
		
		layout.setLeft(godList);
		//Making the screens height small so you can test the ScrollPane.
		Scene scene = new Scene(layout, 600,300);
		primaryStage.setTitle("Norse Gods");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
