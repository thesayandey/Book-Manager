import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Returnbook{
    Returnbook(){
        JFrame returnbook = new JFrame("Return Book");
        returnbook.setLayout(null);

        returnbook.setSize(370, 270);

        JLabel bookid = new JLabel();
        bookid.setText("Book id: ");
        bookid.setBounds(20, 30, 80, 40);
        returnbook.add(bookid);

        JLabel cid = new JLabel();
        cid.setText("Customer id: ");
        cid.setBounds(20, 82, 110, 40);
        returnbook.add(cid);

        JTextField bookidfield = new JTextField();
        bookidfield.setBounds(100, 30, 80, 40);
        returnbook.add(bookidfield);

        JTextField cidfield = new JTextField();
        cidfield.setBounds(100, 84, 80, 40);
        returnbook.add(cidfield);

        JButton returnb = new JButton();
        returnb.setText("Return");
        returnb.setBounds(130, 140, 80, 40);
        returnbook.add(returnb);
        


        returnbook.setVisible(true);
        
    }


    public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new Returnbook();
            }
        });
    }
}