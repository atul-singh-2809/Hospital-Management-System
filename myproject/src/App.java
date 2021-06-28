import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class App extends JFrame implements ActionListener{
    int f;
    JLabel l1,l2;
    JComboBox c1;
    JButton b1;
    ImageIcon i1;
    public static void wake(String m,String n,String o)
    {
        String field[]={m,n};
        abc a=new abc(field,o);
        a.setSize(350,350);
        a.setVisible(true);
        a.setTitle("Hospital Management System");
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public App()
    {
        setLayout(null);
        String field[]={"Cardiology","Neurology","Orthopaedics"};
        l1=new JLabel("Select Field");
        c1=new JComboBox(field);
        b1=new JButton("Next");
        i1=new ImageIcon(getClass().getResource("hos.jpg"));
        l2=new JLabel(i1);
        add(l1);
        add(c1);
        add(b1);
        add(l2);
        l2.setBounds(0,0,350,350);
        l1.setBounds(80,100,100,25);
        c1.setBounds(150,100,100,25);
        b1.setBounds(120,170,80,25);
        c1.addActionListener(this);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==c1)
        {
            JComboBox cb=(JComboBox)e.getSource();;
            String msg=(String)cb.getSelectedItem();
            switch(msg)
            {
                case "Cardiology" : f=1;
                    break;
                case "Neurology" : f=2;
                    break;
                case "Orthopaedics" : f=3;
                    break;
            }
        }
        if(e.getSource()==b1)
        {
            if(f==1)
            {
                App.wake("Dr. Harsh Domadia","Dr. Jay Gala","car.jpg");
            }
            else
            if(f==2)
            {
               App.wake("Dr. Tushar Kadam","Dr. Sangram Desai","neuro.jpg");
            }
            else
            if(f==3)
            {
                App.wake("Dr. Jasdeep Singh","Dr. Atharva Gole","ortho.jpg");
            }
        }
    }
    public static void main(String[] args) throws Exception {
       App gui = new App();
        gui.setSize(350,350);
        
        gui.setVisible(true);
        gui.setTitle("Hospital Management System");
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
