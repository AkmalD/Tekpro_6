package Tugas2;

public class Shape {
    private String color = "red";
    private boolean filled = true;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Shape(){
        color = "Green";
        filled = true;
    }

    public boolean isFilled(){
        if(filled == true){
            return true;
        }
        else{
            return false;
        }
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public String toString() {
        return "Shape[Color=" + color + " Filled=" + filled + "]";
    }
}
