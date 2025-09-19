package com.ruairi.nea2026;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

    public static MenusEnum currentMenu;
    private Stage primaryStage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        showMainMenu(primaryStage);
        primaryStage.setMaximized(true);
        primaryStage.show();
    }

    public void showMainMenu(Stage primaryStage){
        Menu mainMenu = new Menu(MenusEnum.MAIN_MENU);
        Scene mainMenuScene = new Scene(mainMenu.getMenuContainer());
        mainMenu.getLevelSelectButton().setOnAction(e->showLevelSelect(primaryStage));
        primaryStage.setScene(mainMenuScene);
    }

    public void showLevelSelect(Stage primaryStage){
        Menu levelSelect = new Menu(MenusEnum.LEVEL_SELECT);
        Scene levelSelectScene = new Scene(levelSelect.getMenuContainer());
        levelSelect.getBackToMainMenuButton().setOnAction(e->showMainMenu(primaryStage));
        primaryStage.setScene(levelSelectScene);
    }

}
