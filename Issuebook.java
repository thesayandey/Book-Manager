import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Issuebook {
    
    Issuebook(){

        JFrame issuebook = new JFrame("Issue Book");
        issuebook.setLayout(null);
        issuebook.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        issuebook.setSize(400, 500);

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
        booknamefield.setBounds(100, 84, 150, 30);
        issuebook.add(booknamefield);

        JLabel Customer_id = new JLabel();
        Customer_id.setText("Customer id: ");
        Customer_id.setBounds(20, 130, 80, 40);
        issuebook.add(Customer_id);

        JTextField cid = new JTextField();
        cid.setBounds(110, 134, 100, 30);
        issuebook.add(cid);

        JLabel customer_name = new JLabel();
        customer_name.setText("Customer name: ");
        customer_name.setBounds(20, 180, 110, 40);
        issuebook.add(customer_name);

        JTextField cname = new JTextField();
        cname.setBounds(120, 184, 150, 30);
        issuebook.add(cname);

        JLabel customer_phone = new JLabel();
        customer_phone.setText("Customer phone: ");
        customer_phone.setBounds(20, 230, 120, 40);
        issuebook.add(customer_phone);

        JTextField cphone = new JTextField();
        cphone.setBounds(120, 234, 140, 30);
        issuebook.add(cphone);

        JButton issue = new JButton();
        issue.setText("Issue book");
        issue.setBounds(80, 300, 130, 50);
        issuebook.add(issue);

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
