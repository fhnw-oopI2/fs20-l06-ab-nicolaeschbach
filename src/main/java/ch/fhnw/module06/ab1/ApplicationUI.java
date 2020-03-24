package ch.fhnw.module06.ab1;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ApplicationUI extends StackPane{

	private Button button1;
	private Scene Scene1;
	private Stage primaryStage;
	
	public ApplicationUI(Stage primaryStage)  {
		initializeControls();
		layoutControls();
		this.primaryStage = primaryStage;

	}

	private void initializeControls(){
		button1 = new Button("Button1");

		

	}
	
	private void layoutControls() {
		getChildren().add(button1);
		button1.setMaxHeight(60);
		button1.setMaxWidth(120);

	}
}
