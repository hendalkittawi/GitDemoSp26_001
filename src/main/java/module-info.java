module edu.utsa.cs3443.javafxgithubdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.utsa.cs3443.javafxgithubdemo to javafx.fxml;
    exports edu.utsa.cs3443.javafxgithubdemo;
}