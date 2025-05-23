package ru.vsu.cs.dorofeyeva_s_v.rasterization;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class RasterizationApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        System.out.println(RasterizationApplication.class.getResource("mainwindow.fxml"));
        FXMLLoader fxmlLoader = new FXMLLoader(RasterizationApplication.class.getResource("mainwindow.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setTitle("Rasterization App");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}