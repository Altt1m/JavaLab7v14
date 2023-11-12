package com.example.lab7;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LineQuadrant extends Application
{
    @Override
    public void start(Stage stage) {
        int x1 = 100; // Задайте координати x1, y1, x2, y2 за вашими потребами
        int y1 = 100;
        int x2 = -50;
        int y2 = -50;

        int quadrant1 = (x1 > 0 && y1 > 0) ? 1 : (x1 < 0 && y1 > 0) ? 2 : (x1 < 0 && y1 < 0) ? 3 : 4;
        int quadrant2 = (x2 > 0 && y2 > 0) ? 1 : (x2 < 0 && y2 > 0) ? 2 : (x2 < 0 && y2 < 0) ? 3 : 4;

        Pane pane = new Pane();
        Scene scene = new Scene(pane, 400, 400);

        Line xAxis = new Line(0, scene.getHeight() / 2, scene.getWidth(), scene.getHeight() / 2);
        Line yAxis = new Line(scene.getWidth() / 2, 0, scene.getWidth() / 2, scene.getHeight());

        Line line = new Line(scene.getWidth() / 2 + x1, scene.getHeight() / 2 - y1, scene.getWidth() / 2 + x2, scene.getHeight() / 2 - y2);

        Text text1 = new Text(10, 20, "Квадрант першої точки: " + quadrant1);
        Text text2 = new Text(10, 40, "Квадрант другої точки: " + quadrant2);

        pane.getChildren().addAll(xAxis, yAxis, line, text1, text2);

        stage.setTitle("Лабораторна №7 АС-221 Мельник");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
