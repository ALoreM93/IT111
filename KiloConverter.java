import javax.swing. *;
import javax.swing.colorchooser.AbstractColorChooserPanel;
import java.security.PublicKey;

public class KiloConverter extends JFrame {

    JPanel panel;

    JLabel messageLabel;

    JTextField KiloTexField;

    JButton calcbutton;

    final int WINDOW_WIGTH = 350;
    final int WINDOW_HEIGHT = 450;

    //always be aware of the colors that Intellij is using
    // create a constructor which is a special method to inst. our object

    public KiloConverter() {

        setTitle("Kilometer Converter");
         setSize(WINDOW_WIGTH, WINDOW_HEIGHT );
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         buildPanel();
         add(panel);
         setVisible(true);
    }
    public void buildPanel(){
        messageLabel = new JLabel("Enter a distance in Kilometers") ;
        //text, button, panel

        KiloTexField = new JTextField(10);
        calcbutton = new JButton("Calculate");
        panel = new JPanel();
        panel.add(messageLabel);
        panel.add(KiloTexField);
        panel.add(calcbutton);


        }

    //add the main method

    public static void main(String[]args) {

        new KiloConverter();


    }
}
