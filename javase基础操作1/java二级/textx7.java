package java二级;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class textx7 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new MousePanel());
        frame.pack();
        frame.setVisible(true);
    }
}

//*********Found**********
class MousePanel extends JPanel {

    private JLabel b;

    public MousePanel() {
        b = new JLabel("  起始状态  ");
        setLayout(new BorderLayout());
        add(b, BorderLayout.SOUTH);

        addMouseMotionListener(new MouseMotion());
        setPreferredSize(new Dimension(300, 200));
    }

    //*********Found**********
    private class MouseMotion extends MouseMotionAdapter {//考MouseMotionAdapter

        public void mouseMoved(MouseEvent e) {
            //*********Found**********
            b.setText(" 鼠标当前位置: "+ e.getX()+ " , " + e.getY());//考e.getX()  e.getY()
        }
    }
}
