package view;

import controller.VirtualPetController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.image.Image;

public class VirtualPetView extends Application {
    private static final int CELL_SIZE = 20;

    private Canvas canvas;
    private GraphicsContext gc;
    private VirtualPetController controller;

    @Override
    public void start(Stage primaryStage) {
        controller = new VirtualPetController(this);
        int gridSize = controller.getGridSize();
        int canvasSize = gridSize * CELL_SIZE;

        canvas = new Canvas(canvasSize, canvasSize);
        gc = canvas.getGraphicsContext2D();
        StackPane root = new StackPane(canvas);
        Scene scene = new Scene(root, canvasSize, canvasSize);
        primaryStage.setTitle("Graphics Demo");
        primaryStage.setScene(scene);
        primaryStage.show();

        updateCanvas(controller.getPlayerX(), controller.getPlayerY());
    }
    public void updateCanvas(int playerX, int playerY) {
        int gridSize = controller.getGridSize();
        int canvasSize = gridSize * CELL_SIZE;

        gc.clearRect(0, 0, canvasSize, canvasSize);
        Image image = new Image("/sadHamster.jpeg");
        gc.drawImage(image, playerX * CELL_SIZE, playerY * CELL_SIZE);
        gc.setFill(Color.BLUE);

    }
}
