module ListView {
	requires javafx.controls;
	requires javafx.fxml;
	requires lombok;
	opens application to javafx.graphics, javafx.fxml;
}
