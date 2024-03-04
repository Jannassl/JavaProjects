package controller;

import javafx.animation.AnimationTimer;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.VirtualPet;
import view.VirtualPetView;

import javafx.application.Application;

public class VirtualPetController extends Application {
    public void movePet(VirtualPet pet, double targetX, double targetY) {
        double dx = targetX - pet.getX();
        double dy = targetY - pet.getY();
        double distance = Math.sqrt(dx * dx + dy * dy);

        if (distance > 1) {
            pet.setX(pet.getX() + dx / distance);
            pet.setY(pet.getY() + dy / distance);
        }


    }
    @Override
    public void start(Stage primaryStage) {
        VirtualPet pet = new VirtualPet(400, 300); // Initialize the pet at the center of the canvas
        VirtualPetController controller = new VirtualPetController();
        VirtualPetView view = new VirtualPetView(pet, controller);

        Group root = new Group();
        root.getChildren().add(view);
        Scene scene = new Scene(root, 800, 600);

        primaryStage.setScene(scene);
        primaryStage.show();

        new AnimationTimer() {
            @Override
            public void handle(long now) {
                if (view.getMouseX() != -1 && view.getMouseY() != -1) {
                    controller.movePet(pet, view.getMouseX(), view.getMouseY());
                }
                view.drawPet(view.getGraphicsContext2D());
            }
        }.start();
    }
}