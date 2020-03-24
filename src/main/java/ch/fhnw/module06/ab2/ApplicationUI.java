package ch.fhnw.module06.ab2;

import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

public class ApplicationUI extends VBox{
	private Label label;
	private TextField textfield;
	private TextArea textarea;
	private Button button;

	
	public ApplicationUI() {
		initializeControls();
		layoutControls();		
	}
	
	private void initializeControls(){
		label = new Label("Label:");
		textfield = new TextField("Name...");
		textarea = new TextArea("Beschreibung...");
		button = new Button("OK");	
	}

	private void layoutControls() {
		
		Insets inset = new Insets(5, 10, 5, 10);
		
		// Label
		label.setPadding(inset);
		getChildren().add(label);
		
		// Textfield
		textfield.setPadding(inset);
		getChildren().add(textfield);

		// Textarea
		textarea.setPadding(inset);
		getChildren().add(textarea);
		
		// Button
		button.setPadding(inset);
		button.setMinWidth(60);
		button.setMinHeight(20);
		setMargin(button, inset);
		getChildren().add(button);
		
	}
}
