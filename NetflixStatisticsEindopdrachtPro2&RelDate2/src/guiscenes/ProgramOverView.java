package guiscenes;

import database.Read;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
import javafx.stage.Stage;
import logic.Account;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ProgramOverView {
    public static Scene display(Stage stage, Read read, Account loggedPerson) throws FileNotFoundException {
        Rectangle2D screenSize = Screen.getPrimary().getVisualBounds();

        //Set alignment padding, hgap and vgap.
        GridPane programsGridPane = new GridPane();
        programsGridPane.setAlignment(Pos.CENTER);
        programsGridPane.setHgap(20);
        programsGridPane.setVgap(20);
        programsGridPane.setPadding(new Insets(25, 25, 25, 25));

        //Set background color
        Color backgroundColor = Color.web("rgb(100, 97, 97)");
        programsGridPane.backgroundProperty().set(new Background(new BackgroundFill(backgroundColor, CornerRadii.EMPTY, Insets.EMPTY)));

        //Set picture and position.
        Image imgLostInSpace = new Image(new FileInputStream(".\\NetflixStatisticsEindopdrachtPro2&RelDate2\\Photo's\\LostInSpace.jpg"));
        ImageView imageViewLostInSpace = new ImageView(imgLostInSpace);
        imageViewLostInSpace.setFitHeight(100);
        imageViewLostInSpace.setFitWidth(200);
        imageViewLostInSpace.setPickOnBounds(true);
        programsGridPane.add(imageViewLostInSpace, 0, 0);

        //Set picture and position.
        Image imgRickAndMorty = new Image(new FileInputStream(".\\NetflixStatisticsEindopdrachtPro2&RelDate2\\Photo's\\RickAndMorty.jpg"));
        ImageView imageRickAndMorty = new ImageView(imgRickAndMorty);
        imageRickAndMorty.setFitHeight(100);
        imageRickAndMorty.setFitWidth(200);
        imageRickAndMorty.setPickOnBounds(true);
        programsGridPane.add(imageRickAndMorty, 1, 0);

        //Set picture and position.
        Image imgTheFlash = new Image(new FileInputStream(".\\NetflixStatisticsEindopdrachtPro2&RelDate2\\Photo's\\TheFlash.jpg"));
        ImageView imageTheFlash = new ImageView(imgTheFlash);
        imageTheFlash.setFitHeight(100);
        imageTheFlash.setFitWidth(200);
        imageTheFlash.setPickOnBounds(true);
        programsGridPane.add(imageTheFlash, 2, 0);

        //Set picture and position.
        Image imgInsidious = new Image(new FileInputStream(".\\NetflixStatisticsEindopdrachtPro2&RelDate2\\Photo's\\Insidious.jpg"));
        ImageView imageInsidious = new ImageView(imgInsidious);
        imageInsidious.setFitHeight(100);
        imageInsidious.setFitWidth(200);
        imageInsidious.setPickOnBounds(true);
        programsGridPane.add(imageInsidious, 0, 1);

        //Set picture and position.
        Image imgJumanji = new Image(new FileInputStream(".\\NetflixStatisticsEindopdrachtPro2&RelDate2\\Photo's\\Jumanji.jpg"));
        ImageView imageJumanji = new ImageView(imgJumanji);
        imageJumanji.setFitHeight(100);
        imageJumanji.setFitWidth(200);
        imageJumanji.setPickOnBounds(true);
        programsGridPane.add(imageJumanji, 0, 2);

        //Set picture and position.
        Image imgTheDictator = new Image(new FileInputStream(".\\NetflixStatisticsEindopdrachtPro2&RelDate2\\Photo's\\TheDictator.jpg"));
        ImageView imageTheDictator = new ImageView(imgTheDictator);
        imageTheDictator.setFitHeight(100);
        imageTheDictator.setFitWidth(200);
        imageTheDictator.setPickOnBounds(true);
        programsGridPane.add(imageTheDictator, 1, 1);

        //Set picture and position.
        Image imgHowIMetYourMother = new Image(new FileInputStream(".\\NetflixStatisticsEindopdrachtPro2&RelDate2\\Photo's\\HowIMetYourMother.jpg"));
        ImageView imageHowIMetYourMother = new ImageView(imgHowIMetYourMother);
        imageHowIMetYourMother.setFitHeight(100);
        imageHowIMetYourMother.setFitWidth(200);
        imageHowIMetYourMother.setPickOnBounds(true);
        programsGridPane.add(imageHowIMetYourMother, 1, 2);

        //Set picture and position.
        Image imgTheWitcher = new Image(new FileInputStream(".\\NetflixStatisticsEindopdrachtPro2&RelDate2\\Photo's\\TheWitcher.jpg"));
        ImageView imageTheWitcher = new ImageView(imgTheWitcher);
        imageTheWitcher.setFitHeight(100);
        imageTheWitcher.setFitWidth(200);
        imageTheWitcher.setPickOnBounds(true);
        programsGridPane.add(imageTheWitcher, 2, 1);

        //Set picture and position.
        Image imgBrooklynNineNine = new Image(new FileInputStream(".\\NetflixStatisticsEindopdrachtPro2&RelDate2\\Photo's\\BrooklynNineNine.jpg"));
        ImageView imageBrooklynNineNine = new ImageView(imgBrooklynNineNine);
        imageBrooklynNineNine.setFitHeight(100);
        imageBrooklynNineNine.setFitWidth(200);
        imageBrooklynNineNine.setPickOnBounds(true);
        programsGridPane.add(imageBrooklynNineNine, 2, 2);

        //GridPane for different tabs
        GridPane menu = new GridPane();
        menu.setAlignment(Pos.CENTER);
        menu.setHgap(20);
        menu.setVgap(20);
        menu.setPadding(new Insets(25, 25, 25, 25));

        //Button for profileoverview
        Button profileOverView = new Button("Profile");
        menu.add(profileOverView, 0, 0);

        //Button for logOut
        Button logOut = new Button("Log out");
        menu.add(logOut, 1, 0);

        //Button for CRUD scene
        Button cRUD = new Button("CRUD");
        menu.add(cRUD, 2, 0);

        //Button for programoverview
        Button programOverView = new Button("Program overview");
        menu.add(programOverView, 3, 0);

        //Button for overViews
        Button overViews = new Button("Overviews");
        menu.add(overViews, 4, 0);

        //Onclick event for logout
        logOut.setOnAction(event -> {
            stage.setScene(LoginScene.display(stage, read));
        });

        //Onclick event for button CRUD
        cRUD.setOnAction(event -> {
                    stage.setScene(CRUD.display(stage, read, loggedPerson));
                }
        );

        //Onclick event for profileoverview
        profileOverView.setOnAction(event -> {
            stage.setScene(ProfileOverView.display(stage, read, loggedPerson));
        });

        //Onclick event for programoverview
        programOverView.setOnAction(event -> {
            try {
                stage.setScene(ProgramOverView.display(stage, read, loggedPerson));
            } catch (Exception e) {
                e.getMessage();
            }
        });

        //Onclick event for overview
        overViews.setOnAction(event -> {
            stage.setScene(OverViewsDirect.display(stage, read, loggedPerson));
        });

        //Borderpane for layout
        BorderPane mainScene = new BorderPane();
        mainScene.setCenter(programsGridPane);
        mainScene.setBottom(menu);

        //Set background color
        Color backgroundColorUnder = Color.web("rgb(77, 73, 73)");
        mainScene.backgroundProperty().set(new Background(new BackgroundFill(backgroundColorUnder, CornerRadii.EMPTY, Insets.EMPTY)));

        Scene programs = new Scene(mainScene, screenSize.getWidth(), screenSize.getHeight() * 0.978);

        return programs;
    }
}
