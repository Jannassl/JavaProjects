public class Pen {
    private Color color;
    private boolean capOn;
    public enum Color {
        RED("red"), GREEN("green"), BLUE("blue");
        private final String color;
        Color(String color) { this.color = color; };
        @Override public String toString() { return color; }
    }
    public Pen(Color color) {
        this.color = color;
        capOn = true;
}
    public String draw() {
        if (capOn) {
            return "";
        } else {
            return "Drawing " + color.toString().toLowerCase();
        }
    }

    public void capOn() {
        capOn = true;
    }

    public void capOff() {
        capOn = false;
    }

    public void changeColor(Color newColor) {
        if (capOn) {
            color = newColor;
        }
    }
}
