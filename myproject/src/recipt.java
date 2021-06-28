import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;
public class recipt extends JFrame
{
    JLabel l1;  
    public recipt()
    {
        setLayout(new FlowLayout());
        l1=new JLabel("Appointments are full");
        add(l1);
    }
}
