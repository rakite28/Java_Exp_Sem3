package Exp16;

import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*; 
 
class btnPress extends JFrame implements ActionListener { 
    Container c; 
    JLabel L1; 
    JButton B1, B2, B3, B4, exit; 
 
    btnPress() { 
        c = getContentPane(); 
        c.setLayout(new FlowLayout()); 
 
        B1 = new JButton("Button1"); 
        B2 = new JButton("Button2"); 
        B3 = new JButton("Button3"); 
        B4 = new JButton("Button4"); 
        L1 = new JLabel("      "); 
        exit = new JButton("Exit"); 
 
        c.add(B1); 
        c.add(B2); 
        c.add(B3); 
        c.add(B4); 
        c.add(L1); 
        c.add(exit); 
 
        B1.addActionListener(this); 
        B2.addActionListener(this); 
        B3.addActionListener(this); 
        B4.addActionListener(this); 
        exit.addActionListener(this); 
    } 
 
    public void actionPerformed(ActionEvent ae) { 
        if (ae.getSource() == B1) { 
            L1.setText("Button 1 pressed"); 
        } else if (ae.getSource() == B2) { 
            L1.setText("Button 2 pressed"); 
        } else if (ae.getSource() == B3) { 
            L1.setText("Button 3 pressed"); 
        } else if (ae.getSource() == B4) { 
            L1.setText("Button 4 pressed"); 
        } else if (ae.getSource() == exit) { 
            System.exit(0); 
        } else { 
        } 
    } 
 
    public static void main(String z[]) { 
        btnPress frm = new btnPress(); 
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frm.setBounds(200, 200, 250, 250); 
        frm.setVisible(true); 
        frm.setTitle("Button Event"); 
    } 
}
