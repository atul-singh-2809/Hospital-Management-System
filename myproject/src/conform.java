import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;
public class conform extends JFrame
{
    JLabel l1;
    public conform()
    {
        setLayout(new FlowLayout());
        l1=new JLabel("Appointment Booked Successfully");
        add(l1);
    }
}