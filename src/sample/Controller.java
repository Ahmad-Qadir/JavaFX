package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class Controller {
    ObservableList<String> list = FXCollections.observableArrayList("Information Retrival", "Security", "Database", "Information System Architecture", "Bioinformatics");
    @FXML
    private Button submit;
    @FXML
    private TextField name;
    @FXML
    private TextArea textArea;
    @FXML
    private ComboBox<String> lectures;
    @FXML
    private Button clear;


    @FXML
    public void onClickClear(ActionEvent event) {
        textArea.clear();
        name.clear();
        lectures.setItems(list);
    }

    @FXML
    public void onClickSubmit(ActionEvent event) {

    }
}
