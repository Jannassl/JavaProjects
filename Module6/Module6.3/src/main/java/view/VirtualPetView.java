// PetView.java
package view;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import controller.VirtualPetController;

import model.VirtualPet;

public class VirtualPetView extends Canvas{
    private VirtualPet pet;
    private VirtualPetController controller;
    private Image petImage;
    private double mouseX = -1;
    private double mouseY = -1;

    public VirtualPetView(VirtualPet pet, VirtualPetController controller) {
        this.pet = pet;
        this.controller = controller;
        petImage = new Image("/sadHamster.jpg");

        // Set the size of the Canvas
        setWidth(800);
        setHeight(600);

        setOnMouseMoved(event -> {
            mouseX = event.getX();
            mouseY = event.getY();
        });

        setOnMouseExited(event -> {
            mouseX = -1;
            mouseY = -1;
        });
    }

    public void drawPet(GraphicsContext gc) {
        gc.clearRect(0, 0, getWidth(), getHeight());
        gc.drawImage(petImage, pet.getX() - 25, pet.getY() - 25, 50, 50);
    }

    public double getMouseX() {
        return mouseX;
    }

    public double getMouseY() {
        return mouseY;
    }


}