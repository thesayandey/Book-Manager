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
        booklist.setBounds(120, 40, 90, 50);
        operations.add(booklist);  

        JButton addbook = new JButton();
        addbook.setText("Add book");
        addbook.setBounds(120, 150, 90, 50);
        operations.add(addbook);


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
