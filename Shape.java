import java.awt.Color;

public abstract class Shape {
    Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void draw(java.awt.Graphics g);
}