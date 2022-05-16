module com.app.foodgenius {
    requires javafx.controls;
    requires javafx.fxml;
            
                        
    opens com.app.foodgenius to javafx.fxml;
    exports com.app.foodgenius;
}