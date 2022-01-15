//old
package package1;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.*;
public class viewdetails extends Registration implements ActionListener{
    JTextField t11,t12,t13,t14;
    JLabel head;
    JButton del,upd;
    String arr[];
    boolean x=true;boolean y=true;
    viewdetails(String s){
        l1.setVisible(false);
        f.setTitle("Details form");
        head=new JLabel("HERE ARE YOUR ENTERED DETAILS...");
        head.setFont(new Font("Times New Roman",Font.BOLD,30));
        head.setBounds(200,5,850,50);
        head.setForeground(Color.BLUE);
        del=new JButton("Delete");
        upd=new JButton("Update");
        upd.setBounds(550,750,120,40);
        del.setBounds(420,750,120,40);
        cb1.setVisible(false);
        t2.setEditable(false);
        t3.setEditable(false);
        t4.setEditable(false);
        t5.setEditable(false);
        t6.setEditable(false);
        t9.setEditable(false);
        t10.setEditable(false);
        arr=new jdbc().extractdata(s);
        t11=new JTextField("");
        t12=new JTextField("");
        t13=new JTextField("");
        t14=new JTextField("");
        t11.setBounds(230,450,75,25);
        t12.setBounds(230,500,100,25);
        t13.setBounds(230,550,100,25);
        t14.setBounds(230,600,100,25);
        t11.setFont(new Font("Times New Roman",Font.BOLD,15));
        t12.setFont(new Font("Times New Roman",Font.BOLD,15));
        t13.setFont(new Font("Times New Roman",Font.BOLD,15));
        t14.setFont(new Font("Times New Roman",Font.BOLD,15));
        t11.setEditable(false);
        t12.setEditable(false);
        t13.setEditable(false);
        t14.setEditable(false);
        tp7.setEditable(false);
        tp8.setEditable(false);
        jb1.setVisible(false);
        jb2.setVisible(false);
        jb3.setVisible(false);
        jc1.setVisible(false);
        jc2.setVisible(false);
        jc3.setVisible(false);
        b1.setVisible(false);
        del.setFocusable(false);
        upd.setFocusable(false);
        t2.setText(arr[0]);t3.setText(arr[1]); t4.setText(arr[2]);t5.setText(arr[3]); t6.setText(arr[4]);tp7.setText(arr[5]);
        tp8.setText(arr[5]); t11.setText(arr[6]);t12.setText(arr[7]); t13.setText(arr[8]);t14.setText(arr[9]); t9.setText(arr[10]);t10.setText(arr[11]);
        f.add(t12);
        f.add(t13);
        f.add(t14);
        f.add(t11);
        f.add(head);
        f.add(del);f.add(upd);
        upd.addActionListener(this);
        del.addActionListener(this);
        cb7.addActionListener(this);
        cb8.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==upd){
            new update(arr);
            f.dispose();
        }
        if(e.getSource()==del){
              int a= JOptionPane.showConfirmDialog(f,"Are you sure want to delete ?","delete",JOptionPane.YES_NO_OPTION);
              System.out.println(a);
              if(a==0) {
                  try{
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","xxx","yyy");
            Statement  st = con.createStatement();
            String query="delete from studentlist where emailid='"+arr[4]+"'";
            System.out.println(query);
            st.executeUpdate(query);
            con.setAutoCommit(true);
            con.close();
            System.out.println("Success!");
        }
        catch(Exception f){
            System.out.println(f);
        }
                  new login();
                  f.dispose();
              }
               System.out.println("deleted");
        }
        if(e.getSource()==b2){
            new login();
            f.dispose();
        }
        if(e.getSource()==cb7 && x==true){
            tp7.setEchoChar('\0');
            cb7.setVisible(false);
            x=false;
          }
         if(e.getSource()==cb8 && y==true){
            tp8.setEchoChar('\0');
            cb8.setVisible(false);
            y=false;
          }
}
}
