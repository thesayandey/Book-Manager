import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import javax.swing.*;

public class Addbook {
    
    Addbook(){
        

        JFrame addbook = new JFrame("Add Book");
        addbook.setLayout(null);
        addbook.setSize(400,600);



        JLabel bookid = new JLabel();
        bookid.setText("Book id: ");
        bookid.setBounds(30, 30, 80, 40);
        addbook.add(bookid);

        JLabel bookname =  new JLabel();
        bookname.setText("Book name: ");
        bookname.setBounds(30, 80, 80, 40);
        addbook.add(bookname);

        JLabel isbn = new JLabel();
        isbn.setText("ISBN: ");
        isbn.setBounds(30, 130, 80, 40);
        addbook.add(isbn);

        JLabel publisher = new JLabel();
        publisher.setText("Publisher: ");
        publisher.setBounds(30, 180, 80, 40);
        addbook.add(publisher);

        JLabel edition = new JLabel();
        edition.setText("Edition: ");
        edition.setBounds(30, 240, 80, 40);
        addbook.add(edition);

        JLabel price = new JLabel();
        price.setText("Price: ");
        price.setBounds(30, 290, 80, 40);
        addbook.add(price);

        JLabel pages = new JLabel();
        pages.setText("Pages: ");
        pages.setBounds(30, 340, 80, 40);
        addbook.add(pages);



        //ADDing textfields
        JTextField bookidfield = new JTextField();
        bookidfield.setBounds(150, 32, 100, 30);
        addbook.add(bookidfield);

        JTextField booknamefield = new JTextField();
        booknamefield.setBounds(150, 82, 100, 30);
        addbook.add(booknamefield);

        JTextField isbnfield = new JTextField();
        isbnfield.setBounds(150, 132, 100, 30);
        addbook.add(isbnfield);

        JTextField publisherfield = new JTextField();
        //publisherfield.setText(t);
        publisherfield.setBounds(150, 182, 100, 30);
        addbook.add(publisherfield);

        JTextField editionfield = new JTextField();
        editionfield.setBounds(150, 237, 100, 30);
        addbook.add(editionfield);

        JTextField pricefield = new JTextField();
        pricefield.setBounds(150, 287, 100, 30);
        addbook.add(pricefield);

        JTextField pagesfield = new JTextField();
        pagesfield.setBounds(150, 337, 100, 30);
        addbook.add(pagesfield);

        JButton add = new JButton();
        add.setText("Add book");
        add.setBounds(100, 400, 100, 40);
        addbook.add(add);


        addbook.setVisible(true);
    }

    public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new Addbook();
            }
        });
    }
}

