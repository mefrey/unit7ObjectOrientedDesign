import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Write a description of class TriangleComponent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TriangleComponent extends JComponent
{
    public static void main(String[] args)
    {
        // create and configure the frame (window) for the program
        JFrame frame = new JFrame();
        
        frame.setSize(1000 /* x */, 1000 /* y */);
        frame.setTitle("Triangle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // a frame contains a single component; create the Cityscape component and add it to the frame
        TriangleComponent component = new TriangleComponent();
        frame.add(component);
        
        // make the frame visible which will result in the paintComponent method being invoked on the
        //  component.
        frame.setVisible(true);
    }
    private int x1;
    private int x2;
    private int x3;
    private int y1;
    private int y2;
    private int y3;
    /**
     * Creates objects and draws them
     *
     * @param    g    the graphics object used to draw the building
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        Triangle triangle = new Triangle();
        
    }
    public class ClickListener implements ActionListener
    {

        public void actionPerformed( ActionEvent event )
        {

            

        }

    }
}
