package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

public class Controller {

    private Button okButton = null;

    @FXML
    private TabPane tp;

    @FXML
    private Tab t1;

    @FXML
    private Tab t2;

    @FXML
    void addButton(ActionEvent event)  throws Exception {

        okButton = new Button("OK");
        t1.setContent(okButton);
    }

}
