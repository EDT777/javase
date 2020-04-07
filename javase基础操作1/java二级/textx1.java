package java二级;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.awt.*;

//*********Found**********
public class textx1 implements ActionListener{//考
    JFrame f;
    JTextArea ta;
    JFileChooser fc;
    Container c;
    File myFile;

    public static void main(String args[]){
    	textx1 demo=new textx1();
        demo.go();
    }
    void go(){
        JFrame f=new JFrame("File Chooser Demo");
        JButton b=new JButton("Open file");
        ta=new JTextArea("Where is your file path?",10,30);
        //*********Found**********
        b.addActionListener(this);//考
        c=f.getContentPane();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add("South",b);
        f.getContentPane().add("Center",ta);
        f.setSize(300,300);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        fc=new JFileChooser();
        //*********Found**********
        int selected=fc.showOpenDialog(c); //考
        if (selected==JFileChooser.APPROVE_OPTION){
            myFile=fc.getSelectedFile();
            //*********Found**********
            ta.setText("You have selected file: "+myFile.getName());//考
        }
    }
}