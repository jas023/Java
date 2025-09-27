import java.awt.*;
import java.awt.event.*;

public class q2 extends Frame {
    Label label;
    TextField textField;
    Button button;
    List itemList;
    Checkbox checkbox;
    Choice dropdown;

    q2() {
        super("AWT Example!");

        setLayout(new FlowLayout());

        label = new Label("Welcome to our Frame!");
        textField = new TextField(20);
        button = new Button("Click Me");

        itemList = new List(3);
        itemList.add("Item A");
        itemList.add("Item B");
        itemList.add("Item C");

        checkbox = new Checkbox("I Agree");

        dropdown = new Choice();
        dropdown.add("Option 1");
        dropdown.add("Option 2");
        dropdown.add("Option 3");

        add(label);
        add(textField);
        add(itemList);
        add(checkbox);
        add(dropdown);
        add(button);

        setSize(400, 400);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                String selectedItem = itemList.getSelectedItem();
                String selectedChoice = dropdown.getSelectedItem();
                String check = checkbox.getState() ? "Checked" : "Not Checked";

                label.setText("Text: " + text + 
                              ", List: " + selectedItem + 
                              ", Choice: " + selectedChoice + 
                              ", " + check);
            }
        });
    }

    public static void main(String[] args) {
        new q2();
    }
}
