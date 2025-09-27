import java.awt.*;
import java.awt.event.*;

public class q1 {
    public static void main(String args[]) {
        Frame frame = new Frame("AWT Example!");
        frame.setLayout(new FlowLayout()); 

        Label label = new Label("Welcome to our AWT Frame!!");
        TextField tField = new TextField(20);

        Checkbox checkbox = new Checkbox("I Agree to");
        Choice choice = new Choice();
        choice.add("op1");
        choice.add("op2");
        choice.add("op3");
        choice.add("op4");

        List list = new List();
        list.add("item a");
        list.add("item b");
        list.add("item c");

        Button button = new Button("Click me!");

       frame.add(label);
        frame.add(tField);
        frame.add(checkbox);
        frame.add(choice); 
        frame.add(list);
        frame.add(button);

        frame.setSize(400, 300);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
                System.exit(0);
            }
        });

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked....");
            }
        });
    }
}
