package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	
	private static Scene scene;
	
	@Override
	public void start(Stage stage) throws Exception {
		
		//VBox vBox = new VBox();
		// Main.fxml 화면파일을 로드
		Parent layout = loadFXML("Main");
		scene = new Scene( layout, 600, 400);
		stage.setScene(scene);  // stage 에 Scene 등록
		stage.show();
		
	}
	/**
	 * Scene 의 컨테이터를 불러운 FXML 로 지정하는 메소드
	 * @param fxml
	 * @throws IOException
	 */
	static void setRoot(String fxml) throws IOException {
		scene.setRoot(loadFXML(fxml));
		
	}
	/**
	 * FXML 파일을 읽어오는 메소드
	 * @param fxml
	 * @return
	 * @throws IOException
	 */
	private static Parent loadFXML(String fxml) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxml + ".fxml"));
		return fxmlLoader.load();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
