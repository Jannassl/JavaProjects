package controller;
import view.VirtualPetView;
import model.VirtualPet;


public class VirtualPetController {
    private VirtualPet pet;
    private VirtualPetView gui;

    public VirtualPetController(VirtualPetView gui){
        this.pet = new VirtualPet(0,0);
        this.gui = gui;
    }
    public int getPlayerX() {
        return pet.getX();
    }

    public int getPlayerY() {
        return pet.getY();
    }

    public int getGridSize() {
        return pet.getGridSize();
    }

    public static void main(String[] args) {
        VirtualPetView.launch(VirtualPetView.class);
    }
}


