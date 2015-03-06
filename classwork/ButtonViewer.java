import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
public class ButtonViewer
{
    private static final int FRAME_WIDTH = 100;
    private static final int FRAME_HEIGHT = 100;
    private JFrame frame;
    private JPanel panel;
    private JButton buttonA;
    private JButton buttonB;
    private JButton buttonC;
    private JButton buttonD;
    private JButton buttonE;
    private JButton buttonF;
    private JLabel label;


    public ButtonViewer()
    {
        frame = new JFrame();
        panel = new JPanel();
        buttonA = new JButton( "A" );
        buttonB = new JButton( "Bae" );
        buttonC = new JButton( "C" );
        buttonD = new JButton( "D" );
        buttonE = new JButton( "E" );
        buttonF = new JButton( "F" );
        label = new JLabel( "no button has been clicked" );
        panel.add( buttonA );
        panel.add( buttonB );
        panel.add( buttonC );
        panel.add( buttonD );
        panel.add( buttonE );
        panel.add( buttonF );
        panel.add( label );
        frame.add( panel );

        ClickListener listen = new ClickListener();
        buttonA.addActionListener( listen );
        buttonB.addActionListener( listen );
        buttonC.addActionListener( listen );
        buttonD.addActionListener( listen );
        buttonE.addActionListener( listen );
        buttonF.addActionListener( listen );

        frame.setSize( FRAME_WIDTH, FRAME_HEIGHT );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setVisible( true );
    }

    public static void main(String[] args)
    {
        ButtonViewer view = new ButtonViewer();
    }

    public class ClickListener implements ActionListener
    {

        public void actionPerformed( ActionEvent event )
        {

            label.setText( "button "+event.getActionCommand()+" was clicked!" );

        }

    }

}
