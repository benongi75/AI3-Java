package application;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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
	 * 새로운 화면으로 이동
	 * @param root
	 */
	public static void setRoot(Parent root) {
		scene.setRoot(root);
		
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
	
	public static Map<String,Object> get(String fxml) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxml + ".fxml"));
		Parent root = fxmlLoader.load();
		Object controller = fxmlLoader.getController();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loader", fxmlLoader);
		map.put("root", root);
		map.put("controller", controller);
		return map;
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
