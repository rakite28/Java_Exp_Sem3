package Exp16;

import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
 
class MyFrame extends JFrame implements ActionListener 
{ 
 
    private Container c; 
    private JLabel title; 
    private JLabel name; 
    private JTextField tname; 
    private JLabel street; 
    private JTextField tstreet; 
    private JLabel city; 
    private JTextField tcity; 
    private JLabel pincode; 
    private JTextField tpincode; 
    private JCheckBox term; 
    private JButton myinfo; 
    private JButton reset; 
    private JTextArea tout; 
    private JLabel res; 
    private JTextArea resadd; 
 
    public MyFrame() { 
        setTitle("Details"); 
        setBounds(300, 90, 900, 600); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setResizable(false); 
        c = getContentPane(); 
        c.setLayout(null); 
        title = new JLabel("Details"); 
        title.setFont(new Font("Arial", Font.PLAIN, 30)); 
        title.setSize(300, 30); 
        title.setLocation(300, 30); 
        c.add(title); 
 
        name = new JLabel("Name"); 
        name.setFont(new Font("Arial", Font.PLAIN, 20)); 
        name.setSize(100, 20); 
        name.setLocation(100, 100); 
        c.add(name); 
        tname = new JTextField(); 
        tname.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tname.setSize(190, 20); 
        tname.setLocation(200, 100); 
        c.add(tname); 
        street = new JLabel("Street"); 
        street.setFont(new Font("Arial", Font.PLAIN, 20)); 
        street.setSize(100, 20); 
        street.setLocation(100, 150); 
        c.add(street); 
        tstreet = new JTextField(); 
        tstreet.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tstreet.setSize(150, 20); 
        tstreet.setLocation(200, 150); 
        c.add(tstreet); 
        city = new JLabel("City"); 
        city.setFont(new Font("Arial", Font.PLAIN, 20)); 
        city.setSize(100, 20); 
        city.setLocation(100, 200); 
        c.add(city); 
        tcity = new JTextField(); 
        tcity.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tcity.setSize(110, 20); 
        tcity.setLocation(200, 200); 
        c.add(tcity); 
        pincode = new JLabel("Pincode"); 
        pincode.setFont(new Font("Arial", Font.PLAIN, 20)); 
        pincode.setSize(100, 20); 
        pincode.setLocation(100, 250); 
        c.add(pincode); 
        tpincode = new JTextField(); 
        tpincode.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tpincode.setSize(70, 20); 
        tpincode.setLocation(200, 250); 
        c.add(tpincode); 
        term = new JCheckBox("Accept Terms And Conditions."); 
        term.setFont(new Font("Arial", Font.PLAIN, 15)); 
        term.setSize(250, 20); 
        term.setLocation(150, 400); 
        c.add(term); 
 
        myinfo = new JButton("MyInfo"); 
        myinfo.setFont(new Font("Arial", Font.PLAIN, 15)); 
        myinfo.setSize(100, 20); 
        myinfo.setLocation(150, 450); 
        myinfo.addActionListener(this); 
        c.add(myinfo); 
        reset = new JButton("Reset"); 
        reset.setFont(new Font("Arial", Font.PLAIN, 15)); 
        reset.setSize(100, 20); 
        reset.setLocation(270, 450); 
        reset.addActionListener(this); 
        c.add(reset); 
        tout = new JTextArea(); 
        tout.setFont(new Font("Arial", Font.ITALIC, 32)); 
        tout.setSize(300, 400); 
        tout.setLocation(500, 100); 
        tout.setLineWrap(true); 
        tout.setEditable(false); 
        c.add(tout); 
        res = new JLabel(""); 
        res.setFont(new Font("Arial", Font.PLAIN, 20)); 
        res.setSize(500, 25); 
        res.setLocation(100, 500); 
        c.add(res); 
 
        resadd = new JTextArea(); 
        resadd.setFont(new Font("Arial", Font.PLAIN, 15)); 
        resadd.setSize(200, 75); 
        resadd.setLocation(580, 175); 
        resadd.setLineWrap(true); 
        c.add(resadd); 
 
        setVisible(true); 
    } 
 
    public void actionPerformed(ActionEvent e) { 
        if (e.getSource() == myinfo) { 
            if (term.isSelected()) { 
                String data1; 
                String data = "Name : " + tname.getText() + "\n" + "Street : " + tstreet.getText() + "\n" + "City : " 
                        + tcity.getText() + "\n" + "Pincode : " + tpincode.getText() + "\n"; 
                tout.setText(data); 
                tout.setEditable(false); 
                res.setText("Details entered successfully"); 
            } else { 
                tout.setText(""); 
                resadd.setText(""); 
                res.setText("Please accept the" + " terms & conditions.."); 
            } 
        } else if (e.getSource() == reset) { 
            String def = ""; 
            tname.setText(def); 
            tstreet.setText(def); 
            tcity.setText(def); 
            tpincode.setText(def); 
            res.setText(def); 
            tout.setText(def); 
            term.setSelected(false); 
            resadd.setText(def); 
 
        } 
    } 
} 
 
class Details { 
 
    public static void main(String[] args) throws Exception { 
        MyFrame f = new MyFrame(); 
    } 
}
