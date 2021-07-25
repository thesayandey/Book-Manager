import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

 public class Book_manager implements ActionListener{
    JLabel jlab;    //Creating new java label

    Book_manager(){
        //Creating a new Jframe
        JFrame jframe = new JFrame("Book Manager");

        //Specifying the FlowLayout 
        jframe.setLayout(new FlowLayout());
        

        //setting the frame size
        jframe.setSize(700,400);


        //Terminating on exit
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 


        jlab = new JLabel();


        //Creating a new menubar
        JMenuBar jmbar = new JMenuBar();
        //Creating file menues

        JMenu home =  new JMenu("Home");
        jmbar.add(home);

        JMenu login = new JMenu("Log in");
        jmbar.add(login);

        JMenu signup = new JMenu("Sign up");
        jmbar.add(signup);

        JMenu operations = new JMenu("Operations");
        jmbar.add(operations);
        
        JMenu stats = new JMenu("Stats");
        jmbar.add(stats);

        JMenu about = new JMenu("About");
        jmbar.add(about);



        home.addActionListener(this);
        login.addActionListener(this);
        signup.addActionListener(this);
        operations.addActionListener(this);
        stats.addActionListener(this);
        about.addActionListener(this);


        jframe.add(jlab);
        jframe.add(jmbar);
        jframe.setVisible(true);
        
        //Action listner
    
        
    }

    public void actionPerformed(ActionEvent ae){
        String str = ae.getActionCommand();
    }

    public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new Book_manager();
            }
        });
    }
}