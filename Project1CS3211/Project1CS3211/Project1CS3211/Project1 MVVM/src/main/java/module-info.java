module edu.westga.cs3211.project1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;
	requires javafx.base;

    opens edu.westga.cs3211.project1.view to javafx.fxml;
    exports edu.westga.cs3211.project1;
}
