package GUIScenes.Programs;

import GUIScenes.ProgramOverView;
import database.Read;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import logic.Account;
import logic.Serie;

public class LostInSpace {
    public static Scene display(Stage stage, Read read, Account loggedPerson){
        //Scene for the program lost in space
        Serie lostInSpace = read.seriesInfo("Lost in space");

        BorderPane borderPane = new BorderPane();
        Label lostInSpaceLabel = new Label("Lost In Space");
        lostInSpaceLabel.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        HBox hBox = new HBox();
        hBox.getChildren().add(lostInSpaceLabel);
        hBox.setAlignment(Pos.CENTER);
        hBox.setPadding(new Insets(10, 10, 10 ,10));
        borderPane.setTop(hBox);

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(25, 25, 25, 25));

        Label userNameGridPaneProfileOverView = new Label("Title:");
        gridPane.add(userNameGridPaneProfileOverView, 0, 1);

        Label userTextFieldGridPaneProfileOverView = new Label(lostInSpace.getTitle());
        gridPane.add(userTextFieldGridPaneProfileOverView, 1, 1);

        Label lengthLabel = new Label("Language:");
        gridPane.add(lengthLabel, 0, 2);

        Label lengthLabelAnswer = new Label(lostInSpace.getLanguage());
        gridPane.add(lengthLabelAnswer, 1, 2);

        Label languageLabel = new Label("Genre:");
        gridPane.add(languageLabel, 0, 3);

        Label languageLabelAnswer = new Label(lostInSpace.getGenre());
        gridPane.add(languageLabelAnswer, 1, 3);

        Label genreLabel = new Label("Genre:");
        gridPane.add(genreLabel, 0, 4);

        Label genreLabelAsnwer = new Label(lostInSpace.getRecommendation());
        gridPane.add(genreLabelAsnwer, 1, 4);

        Button backButton = new Button("Back");
        gridPane.add(backButton, 0, 8);
        backButton.setOnAction(event -> {
            try {
                stage.setScene(ProgramOverView.display(stage, read, loggedPerson));
            } catch (Exception e) {
                e.getMessage();
            }

        });

        borderPane.setCenter(gridPane);
        Scene lostInSpaceScene = new Scene(borderPane);
        return lostInSpaceScene;
    }
}
