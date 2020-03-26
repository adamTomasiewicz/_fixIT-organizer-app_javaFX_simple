/**
 *
 */
module org.example {
    requires javafx.base;
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires org.apache.commons.lang3;
     requires com.jfoenix;

    opens org.example to javafx.fxml, com.jfoenix;
    opens org.example.controllers to javafx.fxml, com.jfoenix;
    exports org.example to javafx.graphics;
    exports org.example.controllers to javafx.fxml;
    opens javafx.graphics to com.jfoenix;
    opens javafx.stage to com.jfoenix;
//    opens javafx.stage to com.jfoenix;
}