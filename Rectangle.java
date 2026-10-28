
import java.awt.Color;
public class Rectangle extends Shape {

    int x, y, w, h;

    public Rectangle(int x, int y, int w, int h,Color color) {
        super(color);
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    public void draw(java.awt.Graphics g) {
         g.setColor(color);
        g.drawRect(x, y, w, h);
    }
}