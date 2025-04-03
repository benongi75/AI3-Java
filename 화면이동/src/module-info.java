module 화면이동 {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.base;
	opens application to javafx.graphics, javafx.fxml;
}
