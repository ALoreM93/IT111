import javax.swing.*;
import java.awt.*;
import java.awt.Color;


public class ShowWindow2 {
    public static void main(String[] args) {

        // declare our variables
        // we are going to make them CONSTANTS

        final int WINDOW_WIDTH = 350;
        final int WINDOW_HEIGHT = 400;


        // Create a window

        JFrame window = new JFrame();
        JPanel panel = new JPanel();
        //window.getContentPane().setBackground(Color.RED);
        panel.setBackground(Color.RED);

        window.setLocationRelativeTo(null);
        //window.setLayout(new GridLayout(3, 2, 5, 5));
        window.setSize(350, 200);

        //window.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        //panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setLayout(new FlowLayout());
        JLabel label1 = new JLabel();
        label1.setText("My First Big Label!");

        JLabel label2 = new JLabel();

        label2.setText("My Second Big Label!");

        label1.setFont(new Font("Courier", Font.BOLD,12));
        panel.add(label1);
        label2.setFont(new Font("Courier", Font.PLAIN,12));
        panel.add(label2);


        JTextField field1 = new JTextField(10);
        field1.setBounds( new Rectangle(0,0,20,1));
        panel.add(field1);
        panel.add(label2);
       // window.add(label1);
        //window.add(label2);
        //window.pack();






        panel.add(new JTextField(10));
        window.getContentPane().add(panel, BorderLayout.CENTER);

        // Scanner input =new Scanner (System.in);
        // ste the tittle
        window.setTitle("My Simple Window");

        // setting the size of our window
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        // close the window and exit the program

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //display the window - if we dont display the window, it will not display!
        // displaying the window is a boolean





        //window.pack();

//       String text = "A JTextArea object represents a multiline area for displaying text. "
//                + "You can change the number of lines that can be displayed at a time, "
//                + "as well as the number of columns. You can wrap lines and words too. "
//                + "You can also put your JTextArea in a JScrollPane to make it scrollable.";

//        JTextArea textAreal = new JTextArea(text, 5, 10);
//        textAreal.setPreferredSize(new Dimension(100, 100));
//        JTextArea textArea2 = new JTextArea(text, 5, 10);
//        textArea2.setPreferredSize(new Dimension(100, 100));
//        JScrollPane scrollPane = new JScrollPane(textArea2, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
//                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

//        textAreal.setLineWrap(true);
//        textArea2.setLineWrap(true);
//        window.add(textAreal);
//        window.add(scrollPane);
//        window.pack();
//        window.setVisible(true);

        window.setVisible(true);

    }
    //public void buildPanel(){




    }
