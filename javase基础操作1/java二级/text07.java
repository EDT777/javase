package java二级;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class text07{
  public static void main(String[] args){
    RadioButtonFrame frame = new RadioButtonFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//*********Found**********
    frame.show();//考
  }
}
class RadioButtonFrame extends JFrame{
  public RadioButtonFrame(){
    setTitle("Radio按钮实例");
    setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    Container contentPane = getContentPane();
    label = new JLabel("热烈庆祝Java程序语言开考三周年");
    label.setForeground(Color.yellow);
    contentPane.setBackground(Color.red);
    label.setFont(new Font("黑体", Font.PLAIN, DEFAULT_SIZE));
    contentPane.add(label, BorderLayout.CENTER);
    buttonPanel = new JPanel();
    group = new ButtonGroup();
    addRadioButton("小", 8);
    addRadioButton("中", 12);
    addRadioButton("大", 18);
    addRadioButton("特大", 30);
    contentPane.add(buttonPanel, BorderLayout.SOUTH);
  }
  public void addRadioButton(String name, final int size){
    boolean selected = size == DEFAULT_SIZE;
//*********Found**********
    JRadioButton button = new JRadioButton(name, selected);
    group.add(button);
    buttonPanel.add(button);
    ActionListener listener = new ActionListener(){
//*********Found**********
      public void actionPerformed(ActionEvent evt){//考
        label.setFont(new Font("黑体", Font.PLAIN, size));
      }
    };
//*********Found**********
    button.addActionListener(listener);//考
  }
  public static final int DEFAULT_WIDTH = 340;
  public static final int DEFAULT_HEIGHT = 200;
  private JPanel buttonPanel;
  private ButtonGroup group;
  private JLabel label;
  private static final int DEFAULT_SIZE = 12;
}
