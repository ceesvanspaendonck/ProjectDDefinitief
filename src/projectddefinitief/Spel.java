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
        int width = 100;
        int height = 100;
        
        int widthFixed = width / 20;
        int heightFixed = height / 20;
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width,height);
        frame.setPreferredSize(new Dimension(width, height));
        frame.pack();
        frame.setTitle("Doolhof");
        
        Speler speler = new Speler(0,0);
        
        Tegel[][] grid = vormTegelGrid(widthFixed, heightFixed);
        
        
        frame.add(speler);                                          //wel een suitable method found (draw) maar geen resultaat?
        frame.repaint();
        frame.validate();
        frame.setVisible(true);       
    }
    
    public static Tegel[][] vormTegelGrid(int widthFixed, int heightFixed)
    {
        Tegel[][] grid = new Tegel[widthFixed][heightFixed];
        for (int i = 0; i < widthFixed; i++)
        {
            for (int j = 0; j < heightFixed; j++)
            {
                System.out.println("x: " + i + ", y: " + j);
                //grid[i][j].x = i; <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<------------deze gaat fout: .x bestaat niet (nullpointer exception)
                //grid[i][j].y = j;
                
                //System.out.println("Grid[" + i + "][" + j + "].x = " + grid[i][j].x);
            }
        }
        return grid;
    }
    

}
