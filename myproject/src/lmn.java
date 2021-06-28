import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;
public class lmn extends JFrame
{
    JLabel l1;
    public lmn()
    {
        setLayout(new FlowLayout());
        l1=new JLabel("Appointment Booked Successfully");
        add(l1);
    }
}