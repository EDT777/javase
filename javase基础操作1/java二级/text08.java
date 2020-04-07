package java二级;

import javax.swing.*;
import java.awt.*;

public class text08{
  public static void main(String[] args){
    WelcomFrame frame = new WelcomFrame();
//*********Found**********
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );//考
    frame.setVisible(true);
  }
}
//*********Found**********
class WelcomFrame extends JFrame{//考
  public WelcomFrame(){
    setTitle("Java等级考试");
//*********Found**********
    setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);//考
    WelcomPanel panel = new WelcomPanel();
    Container contentPane = getContentPane();
    contentPane.add(panel);
  }
  public static final int DEFAULT_WIDTH = 250;
  public static final int DEFAULT_HEIGHT = 100;
}
//*********Found**********
class WelcomPanel extends JPanel{//考
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    g.drawString("欢迎参加Java等级考试！",MESSAGE_X, MESSAGE_Y);
  }
  public static final int MESSAGE_X = 60;
  public static final int MESSAGE_Y = 50;
}
