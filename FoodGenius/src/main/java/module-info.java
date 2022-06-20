module com.app.foodgenius {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;
    requires org.kordamp.ikonli.core;
    requires org.kordamp.ikonli.javafx;
    // add icon pack modules
    requires org.kordamp.ikonli.fontawesome5;
    requires org.kordamp.ikonli.fontawesome;
    requires org.kordamp.ikonli.material;
            
                        
    opens com.app.foodgenius to javafx.fxml;
    exports com.app.foodgenius;
}