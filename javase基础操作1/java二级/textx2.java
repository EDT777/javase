package java二级;

import java.awt.*;
import java.awt.event.*;
//*********Found**********
import javax.swing.*;

public class textx2 {

    public static void main(String[ ] args) {
        JFrame frame = new JFrame("Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //*********Found**********
        frame.getContentPane().add(new Change());//考getContentPane()

        frame.pack();
        frame.setVisible(true);
    }
}

class Change extends JPanel {

    int count = 200;
    JLabel l1;
    JButton b1, b2;

    public Change( ) {
        setPreferredSize(new Dimension(280, 60));
        l1 = new JLabel("200");
        b1 = new JButton("增大");
        b2 = new JButton("减小");
        add(l1);
        //*********Found**********
        add(b1);//kao 
        //*********Found**********
        add(b2);//考
        b1.addActionListener( new BListener( ) );
        b2.addActionListener( new BListener( ) );
    }

    //*********Found**********
    private class  BListener implements ActionListener {//考

        //*********Found**********
        public void  actionPerformed(ActionEvent e) {//考actionperformed
            if (e.getSource( ) == b1) {
                count++;
            } else {
                count--;
            }
            l1.setText("" + count);
        }
    }
}