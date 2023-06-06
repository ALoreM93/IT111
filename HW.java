import javax.swing. *;
import javax.swing.colorchooser.AbstractColorChooserPanel;
import java.awt.*;
import java.security.PublicKey;

public class HW extends JFrame {

    JPanel panel;

    JLabel messageLabel;

    JTextField KiloTexField;

    JButton calcbutton;

    final int WINDOW_WIGTH = 350;
    final int WINDOW_HEIGHT = 450;

    //always be aware of the colors that Intellij is using
    // create a constructor which is a special method to inst. our object

    public HW() {

        setTitle("My Simple Window");
        setSize(WINDOW_WIGTH, WINDOW_HEIGHT );
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.RED);
        setLocation(200,200);

        buildPanel();
        add(panel);
        setVisible(true);
    }
    public void buildPanel(){
        messageLabel = new JLabel("Enter a distance in Kilometers") ;
        //text, button, panel

        panel = new JPanel();
        panel.setLayout((new BoxLayout(panel, BoxLayout.Y_AXIS)));
        panel.setBackground(Color.RED);
        //JPanel panel = new JPanel();
             //window.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

        JLabel label1 = new JLabel("Test");
        label1.setText("My First Big Label!");
        label1.setFont(new Font("Courier", Font.PLAIN,12));
        panel.add(label1);
        JTextField field1 = new JTextField(2);
        field1.setBounds( new Rectangle(0,0,0,0));
        field1.setSize(new Dimension(10,1));
        panel.add(field1);


        JLabel label2 = new JLabel("Test");
        label2.setText("My Second Big Label!");
        label2.setFont(new Font("Courier", Font.BOLD,12));
        panel.add(label2);
        panel.add(new JTextField(2));
        //field1.setBounds( new Rectangle(0,0,0,0));
        //panel.add(field1);
    }

    //add the main method

    public static void main(String[]args) {

        new HW();


    }
}

