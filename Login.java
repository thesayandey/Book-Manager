import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import javax.swing.text.FlowView;

public class Login implements ActionListener{

    //JLabel jlab;
    Login(){
        JFrame loginframe = new JFrame("Log in");

        loginframe.setLayout(null);

        loginframe.setSize(600, 320);

        loginframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel username = new JLabel();
        username.setText("Username:");
        username.setBounds(20, 80, 80, 30);
        loginframe.add(username);
        
        JLabel password = new JLabel();
        password.setText("Psssword:");
        password.setBounds(20, 120, 80, 30);
        loginframe.add(password);

        
        JTextField uname = new JTextField();
        uname.setBounds(120, 80, 80, 30);
        loginframe.add(uname);

        JTextField pass = new JTextField();
        pass.setBounds(120, 120, 80, 30);
        loginframe.add(pass);

        JButton login = new JButton();
        login.setText("Log in");
        login.setBounds(160, 180, 80, 40);
        loginframe.add(login);


        JButton forgot = new JButton();
        forgot.setText("Forgot password");
        forgot.setBounds(350, 110, 80, 40);
        loginframe.add(forgot);


        loginframe.setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
        String str = ae.getActionCommand();
    }


    public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new Login();
            }
        });
    }

    
}