
import java.awt.Color;
public class line extends Shape {

    int x1, y1, x2, y2;

    public line(int x1, int y1, int x2, int y2,Color color) {
        super(color);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void draw(java.awt.Graphics g) {
        
        g.setColor(color);
        g.drawLine(x1, y1, x2, y2);
    }
}