package java二级;

import java.io.*;
import java.awt.*;
import java.awt.event.* ;
//**********found**********
import  javax.swing.*;//考

public class textxx implements ActionListener { 
   
    JTextArea ta;
    JFrame f ;
    JLabel label;
    JButton bs,br;
   
    public static void main(String[ ] args){
    	textxx t = new textxx();
	  t.go();
    }
	
    void go(){
	  f = new JFrame("Save data");
	  f.setSize( 20, 400);
      //**********found**********
	  f.setLayout(new FlowLayout());//考setLayout
	  label = new JLabel("请输入需要保存的文本 ：");
	  ta = new JTextArea(3,20);
	  bs = new JButton("保存");
	  br = new JButton("读取");
	  f.add(label);
	  f.add(ta);
	  f.add(bs);
	  f.add(br);
      //**********found**********
	  bs.addActionListener(this);
      //**********found**********
	  br.addActionListener(new ReadFile()); //考
	  
	  f.setSize(400,400);
	  f.pack( );
	  f.setVisible(true) ;
	  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
    }
	
    public void actionPerformed(ActionEvent event){
          try{
              FileWriter  out = new FileWriter("out.txt");
              String str = ta.getText();
             //**********found**********
             out.write(str);  //考
             out.close();
          } catch( Exception e){
          }
       	  ta.setText(" ");
     }  
     
    class ReadFile implements ActionListener{
       public void actionPerformed(ActionEvent event){
       	   String cc;
       	   StringBuffer str = new StringBuffer("");
           try{
               FileReader  in = new FileReader("out.txt");
               //**********found**********
               BufferedReader bin= new BufferedReader(in);      //考
               while ( (cc = bin.readLine())!= null)
                   str.append(cc);
               bin.close();
               ta.setText(str.toString());
           } catch( Exception e){ }
      } 
   } 
 }

