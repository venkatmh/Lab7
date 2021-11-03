import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Counter implements ActionListener {
  JLabel leftLabel;
  JLabel rightLabel;
  int countLeft;
  int countRight;

  Counter() {
    JFrame frame = new JFrame("Let's Count");
    frame.setLayout(new FlowLayout());
	  frame.setSize(220,110);

    JButton left = new JButton("Left");
	  JButton right = new JButton("Right");
    frame.add(left);
    frame.add(right);

    int countLeft = 0;
    int countRight = 0;

    left.addActionListener(this);
	  right.addActionListener(this);

    leftLabel = new JLabel("Count:" + countLeft);
    rightLabel = new JLabel("Count:" + countRight);
    frame.add(leftLabel);
    frame.add(rightLabel);

    JButton reset = new JButton("Reset");
    reset.addActionListener(this);
    frame.add(reset);

    frame.setVisible(true);

  }

  public void actionPerformed(ActionEvent ae) {
   if(ae.getActionCommand().equals("Left")) {
    countLeft++;
    leftLabel.setText("Count: " + countLeft);
   } 
   else if(ae.getActionCommand().equals("Right")){
	  countRight++;
    rightLabel.setText("Count: " + countRight);
   }else if(ae.getActionCommand().equals("Reset")){
    countLeft = 0;
    countRight = 0;
    leftLabel.setText("Count:");
    rightLabel.setText("Count:");
   }
 }

}