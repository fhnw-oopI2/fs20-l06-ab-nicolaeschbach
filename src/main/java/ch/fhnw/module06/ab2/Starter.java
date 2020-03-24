package ch.fhnw.module06.ab2;

import javafx.application.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Starter extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Parent rootPanel = new ApplicationUI();
		Scene scene = new Scene(rootPanel);
		primaryStage.setTitle("AB2 - VBox");
		primaryStage.setScene(scene);
		primaryStage.setHeight(350);
		primaryStage.setWidth(300);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Starter.launch(args);
	}
}
