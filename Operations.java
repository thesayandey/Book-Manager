import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Operations {
    Operations(){
        JFrame operations = new JFrame("Operations");

        operations.setLayout(null);
        operations.setSize(600, 320);

        operations.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton booklist = new JButton();
        booklist.setText("Book List");
        booklist.setBounds(120, 40, 130, 50);
        operations.add(booklist);  

        JButton addbook = new JButton();
        addbook.setText("Add book");
        addbook.setBounds(120, 150, 130, 50);
        operations.add(addbook);

        JButton issuebook = new JButton();
        issuebook.setText("Issue book");
        issuebook.setBounds(380, 40, 130, 50);
        operations.add(issuebook);

        JButton returnbook = new JButton();
        returnbook.setText("Return book");
        returnbook.setBounds(380, 150, 130, 50);
        operations.add(returnbook);


        operations.setVisible(true);
    }


    public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new Operations();
            }
        });
    }
}
