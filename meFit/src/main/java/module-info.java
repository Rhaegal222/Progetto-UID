module com.mefit.mefit {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.mefit.mefit to javafx.fxml;
    exports com.mefit.mefit;
}