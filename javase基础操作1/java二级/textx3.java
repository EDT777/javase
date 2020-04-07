package java二级;

//*********Found**********
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.awt.*;

//*********Found**********
public class textx3 implements ActionListener {//考

  JFrame f;
  JPanel p;
  JColorChooser cc;
  Container c;
  Color myColor;
  JMenuBar mb;
  JMenu m1;
  JMenuItem mi1;

  public static void main(String args[]) {
	  textx3 demo = new textx3();
      demo.go();
  }

  void go() {
      JFrame f = new JFrame("File Chooser Demo");
      mb = new JMenuBar();
      f.setJMenuBar(mb);
      m1 = new JMenu("Edit");
      mb.add(m1);
      mi1 = new JMenuItem("Choose Color");
      m1.add(mi1);
      mi1.addActionListener(this);
      //*********Found**********
      c = f.getContentPane();//考
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      p = new JPanel();
      myColor = Color.red;
      p.setBackground(myColor);
      c.add("Center", p);
      f.setSize(300, 300);
      //*********Found**********
      f.setVisible(true);//考
  }

  public void actionPerformed(ActionEvent e) {
      //*********Found**********
      cc = new JColorChooser();//考JColorChooser
      myColor = cc.showDialog(c, "Choose window background color", Color.white);
      p.setBackground(myColor);
  }
}
