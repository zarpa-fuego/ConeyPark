module com.example.coneypark {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.coneypark to javafx.fxml;
    exports com.example.coneypark;
}