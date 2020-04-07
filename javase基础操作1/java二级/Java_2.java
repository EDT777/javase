package java二级;

import java.awt.*;//考
import java.io.*;
import java.awt.event.* ;
import javax.swing.*;

//*********Found********
public class Java_2 implements ActionListener{ //考
   
    JTextArea ta;
    JFrame f ;
    JLabel label;
    JButton bt;

    public static void main(String args[ ]){
        Java_2 t = new Java_2();
        t.go();
    }

    void go(){
        f = new JFrame("Save data");
        label = new JLabel("请输入需要保存的文本：");
        ta = new JTextArea(3,20);
        bt = new JButton("保存");
        //*********Found********
        f.add(label,BorderLayout.NORTH);//考
        f.add(ta,BorderLayout.CENTER);
        f.add(bt,BorderLayout.SOUTH);
        //*********Found********
        bt.addActionListener(this);//考
        f.setSize(400,400);
        f.pack( );
        f.setVisible(true) ;
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
    }
	
    public void actionPerformed(ActionEvent event){
        try{
            FileWriter  out = new FileWriter("out.txt");
            String str = ta.getText();
            //*********Found********
            out.write(str);  //考
            out.close();
        } catch( Exception e){
       	}
    }    
}
