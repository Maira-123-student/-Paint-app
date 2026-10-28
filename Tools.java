import java.awt.Color;

public abstract class Tools {
    Color color;

    public Tools(Color color) {
        this.color = color;
    }

    public abstract void draw(java.awt.Graphics g);
}