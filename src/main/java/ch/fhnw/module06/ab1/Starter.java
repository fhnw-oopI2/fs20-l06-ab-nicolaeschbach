package ch.fhnw.module06.ab1;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;

public class Starter extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Parent rootPanel = new ApplicationUI(primaryStage);
		Scene scene = new Scene(rootPanel);
		primaryStage.setTitle("JavaFX Application");
		primaryStage.setScene(scene);
		primaryStage.setHeight(300);
		primaryStage.setWidth(400);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Starter.launch(args);
	}
}
