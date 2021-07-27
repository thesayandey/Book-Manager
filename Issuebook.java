import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Issuebook {
    
    Issuebook(){

        JFrame issuebook = new JFrame("Issue Book");
        issuebook.setLayout(null);
        issuebook.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        issuebook.setSize(800, 600);

        JLabel bookid = new JLabel();
        bookid.setText("Book id: ");
        bookid.setBounds(20, 30, 80, 40);
        issuebook.add(bookid);

        JTextField bookidfield = new JTextField();
        bookidfield.setBounds(100, 32, 100, 30);
        issuebook.add(bookidfield);

        JLabel bookname = new JLabel();
        bookname.setText("Book name: ");
        bookname.setBounds(20, 80, 80, 40);
        issuebook.add(bookname);

        JTextField booknamefield = new JTextField();
        booknamefield.setBounds(100, 84, 100, 30);
        issuebook.add(booknamefield);


        issuebook.setVisible(true);
    }


    public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new Issuebook();
            }
        });
    }
}
