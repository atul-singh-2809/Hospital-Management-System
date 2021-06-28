import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
public class booking extends JFrame implements ActionListener
{
    JLabel l1,l2,l3;
    JButton b1;
    JTextField t1,t2,t3;
    String n;
    public booking(String m)
    {
        n=m;
        setLayout(new FlowLayout());
        l1=new JLabel("Full Name"); 
        l2=new JLabel("       Age    ");
        l3=new JLabel("Phone No.");
        t1=new JTextField(22);
        t2=new JTextField(22);
        t3=new JTextField(22);
        b1=new JButton("Submit");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            Calendar cal = Calendar.getInstance();
            int year = cal.get(Calendar.YEAR);
            int month = cal.get(Calendar.MONTH);
            int day = cal.get(Calendar.DAY_OF_MONTH);
            String da=year+"-"+(month+1)+"-"+day;
            String s1=t1.getText();
            int age=Integer.parseInt(t2.getText());
            double pno=Double.parseDouble(t3.getText());
            try
            {
                int max=0;
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jp", "root", "Mohit@87094");
                Statement myStmt = myConn.createStatement();
                ResultSet myRs = myStmt.executeQuery("select max(id) from jp."+n);
                if(myRs.next())
                {
                    max=myRs.getInt(1);
                }
                ++max;
                String sq1 = "insert into "+n+" (id, full_name, age, contact, date) values ('"+max+"', '"+s1+"', '"+age+"', '"+pno+"', '"+da+"')";
                myStmt.executeUpdate(sq1);
                System.out.println("Insert Successful");
                conform l=new conform();
                l.setBounds(60,120,250,65);
                l.setVisible(true);
                l.setTitle("Thankyou!!");
                l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
            catch(Exception ae)
            {
                ae.printStackTrace();
            }
        }
    }
}
