import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// -------- MODEL --------
class LoginModel {
    public boolean checkUser(String user, String pass) {
        return user.equals("admin") && pass.equals("1234");
    }
}

// -------- VIEW --------
class LoginView extends JFrame {
    JTextField userField = new JTextField(15);
    JPasswordField passField = new JPasswordField(15);
    JButton loginBtn = new JButton("Login");
    JLabel msgLabel = new JLabel(" ");

    LoginView() {
        setTitle("Login - MVC Example");
        setSize(300, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        panel.add(new JLabel("Username:"));
        panel.add(userField);
        panel.add(new JLabel("Password:"));
        panel.add(passField);
        panel.add(loginBtn);
        panel.add(msgLabel);

        add(panel);
    }
}

// -------- CONTROLLER --------
class LoginController {
    LoginModel model;
    LoginView view;

    LoginController(LoginModel m, LoginView v) {
        this.model = m;
        this.view = v;

        view.loginBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String u = view.userField.getText();
                String p = new String(view.passField.getPassword());

                if (model.checkUser(u, p)) {
                    view.msgLabel.setText("Login Successful ✅");
                } else {
                    view.msgLabel.setText("Invalid Credentials ❌");
                }
            }
        });
    }
}

// -------- MAIN --------
public class q3 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LoginModel model = new LoginModel();
            LoginView view = new LoginView();
            new LoginController(model, view);
            view.setVisible(true);
        });
    }
}
