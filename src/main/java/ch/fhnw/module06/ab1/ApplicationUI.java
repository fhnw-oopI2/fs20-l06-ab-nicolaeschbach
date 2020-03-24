package ch.fhnw.module06.ab1;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.StackPane;

public class ApplicationUI extends StackPane{

	private Button button1;

	private Tooltip tooltip1;
	
	public ApplicationUI()  {
		initializeControls();
		layoutControls();
	}

	private void initializeControls(){
		button1 = new Button("Button1");
		tooltip1 = new Tooltip();
		

	}
	
	private void layoutControls() {
		getChildren().add(button1);

		tooltip1.setText("Hier Drücken");
		Insets insetButton = new Insets(100);
		setMargin(button1, insetButton);
		button1.setTooltip(tooltip1);
		button1.setMinWidth(80);
		button1.setMinHeight(60);
		button1.setMaxHeight(60);
		button1.setMaxWidth(120);

	}
}
