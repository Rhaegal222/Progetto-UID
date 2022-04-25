module com.app.mefit {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.app.mefit to javafx.fxml;
    exports com.app.mefit;
}