module com.ruairi.nea2026 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.ruairi.nea2026 to javafx.fxml;
    exports com.ruairi.nea2026;
}