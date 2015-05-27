package projectddefinitief;

import java.awt.*;
import javax.swing.*;

/*
 * Max & Cees
 */
public class Speler extends JPanel
{
    int x, y;
    final int heigth = 20;
    final int width = 20;
    private Tegel locatie;

    public Speler(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public int getX()
    {
        return this.x;
    }
    @Override
    public int getY()
    {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
      
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g; 
        Rectangle box = new Rectangle(x, y, heigth, width);
        g2.draw(box);
    }
    
    public void drawComponent(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
}
