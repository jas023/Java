import javax.swing.*;
import java.awt.event.*;

public class q4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Popup Menu Example");

        JPopupMenu popupMenu = new JPopupMenu();

        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");

        popupMenu.add(cut);
        popupMenu.add(copy);
        popupMenu.add(paste);

        cut.addActionListener(e -> System.out.println("Cut Selected"));
        copy.addActionListener(e -> System.out.println("Copy Selected"));
        paste.addActionListener(e -> System.out.println("Paste Selected"));

        frame.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) { // right-click
                    popupMenu.show(frame, e.getX(), e.getY());
                }
            }
        });

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
