
import java.awt.Color;
public class Circle extends Shape {

    int x, y, r;

    public Circle(int x, int y, int r,Color color) {
        super(color);
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public void draw(java.awt.Graphics g) {
        g.setColor(color);
        g.drawOval(x, y, r, r);
    }
}