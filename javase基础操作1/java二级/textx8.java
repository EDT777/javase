package java二级;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class textx8  extends JFrame implements ActionListener{
    private double x = 0;
    private double y = 0;
    JTextField xval = new JTextField(10);
    JButton calcBtn = new JButton("计算");
    JTextArea result = new JTextArea(10,20);
    void initFrame(){
        Container content = getContentPane();
        content.setLayout(new BorderLayout());
        JPanel calcPanel = new JPanel();		
        calcPanel.setLayout(new FlowLayout());		
        calcPanel.add(new JLabel("角度"));
        calcPanel.add(xval);
        //***************************Found*********************    
        calcPanel.add(calcBtn);//考
        content.add(calcPanel,"North");
        //***************************Found*********************    
        calcBtn.addActionListener(this);  //考     
        content.add(result,"Center");
        //***************************Found*********************    
        result.setEditable(false);//考
    }
    public textx8(){
       super("计算正弦函数");
       setSize(500,200);
       initFrame();		
       setVisible(true);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
     //***************************Found*********************   
       if (e.getSource()==calcBtn){
          x = Double.parseDouble(xval.getText())/180*3.14;     
          y = Math.sin(x); 
          //***************************Found*********************           
          String str="sin("+ xval.getText() +"*3.14/180)= "+y+'\n';  //考xval.getText() 
          //***************************Found*********************    
       	  result.append(str);   //考
       }
    }
    public static void main(String[] args){
    	new textx8();
    }
}