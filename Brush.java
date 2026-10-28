

import java.awt.Color;

public class Brush extends Tools  {
    int x1, y1, x2, y2;
    Color color;
    int thickness;

    public Brush(int x1, int y1, int x2, int y2, Color color, int thickness) {
         super(color); 
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.color = color;
        this.thickness = thickness;
    }

    public void draw(java.awt.Graphics g) {
        java.awt.Graphics2D g2 = (java.awt.Graphics2D) g;
        g2.setColor(color);
        g2.setStroke(new java.awt.BasicStroke(thickness));
        g2.drawLine(x1, y1, x2, y2);
    }
}
