package cs112.lab09.controllers;

import cs112.lab09.Constants;
import cs112.lab09.RedSummer;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import static cs112.lab09.Constants.MAP_VIEW_RESOURCE;
import static cs112.lab09.Constants.MAP_VIEW_TITLE;

public class MapController {

    public void handleOpenPopup() {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(RedSummer.class.getResource(MAP_VIEW_RESOURCE));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.setTitle(MAP_VIEW_TITLE);
        Constants.Event eventIndex = Constants.Event.BISBEE;
        CityController cityController = fxmlLoader.getController();
        cityController.initData(eventIndex);
        stage.show();
    }
}
