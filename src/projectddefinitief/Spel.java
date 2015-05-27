package projectddefinitief;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*/
 * Max & Cees
/*/

public class Spel
{
    public static void main(String[] args)
    {
        int height = 1000;
        int width = 1000;
        
        JFrame frame = new JFrame();
        JPanel panel=new JPanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(width, height));
        frame.pack();
        frame.setTitle("Doolhof");
        
        Tegel[][] grid = vormTegelGrid(width, height);
        frame.add(grid);                                            //geen suitable method (bijv. draw) found voor add -  maar die is er wel?
        
        Speler speler = new Speler(10,10);
        
        frame.add(speler);                                          //wel een suitable method found (draw) maar geen resultaat?
        
        
        frame.add(panel);
        frame.repaint();
        frame.validate();
        frame.setVisible(true);  
        
    }
    
    public static Tegel[][] vormTegelGrid(int height, int width)
    {
        int x = width / 20;
        int y = height / 20;
        Tegel[][] grid = new Tegel[x][y];
        return grid;
    }
    

}
