package GUIScenes;

import database.Read;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import logic.Account;
import logic.StringForTableView;

import java.util.ArrayList;

public class FilmsWatched {
    public static Scene display(Stage stage, Read read, Account loggedPerson) {
        ArrayList<StringForTableView> films = read.getWatchedFilms(loggedPerson.getAccountName());

        // Scene Tableview
        final Label label = new Label("Films Watched");
        label.setFont(new Font("Arial", 20));

        TableView<StringForTableView> table = new TableView<>();
        table.setMaxWidth(500);

        TableColumn movieTitle = new TableColumn("Movie Title");
        movieTitle.setMinWidth(500);
        ObservableList<StringForTableView> data = FXCollections.observableArrayList(films);
        movieTitle.setCellValueFactory(
                new PropertyValueFactory<>("string"));
        table.getColumns().add(movieTitle);
        table.setItems(data);



        table.setEditable(false);

        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(label, table);

        Scene scene = new Scene(vbox);
        return scene;
    }
}
