package modulerisk;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private Button button;
    @FXML
    private Button button1;
    @FXML
    private Button button3;
    @FXML
    private ListView<String> listBoxMain;
    @FXML
    private ListView<String> listBoxMain1;
    final ObservableList<String> listItems = FXCollections.observableArrayList("Файл 1");

    @FXML
    public void onClickMethod(){
        //TODO
        button.setText("Thanks!");
    }
    @FXML
    public void onClickMethod1(){
        //TODO
        button1.setText("Thanks!");
    }

    @FXML
    public void onClickMethod2(){
        //TODO
        button3.setText("Thanks!");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        listItems.add("Файл2");
        listItems.add("Файл3");
        listBoxMain.setItems(listItems);
        listBoxMain1.setItems(listItems);
    }
}
