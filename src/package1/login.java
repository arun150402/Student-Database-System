package package1;
import java.awt.Color;
import java.awt.Font;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class login implements ActionListener{
  JFrame f;
  JButton b1,b2;
  JLabel l1,l2,pic,war;
  JTextField t1;
  JCheckBox che1;
  JPasswordField p1;
  boolean x=true;
  login()
  {
      f=new JFrame("Login Form");
      b1=new JButton("Submit");
      b2=new JButton("Cancel");
      b1.setFont(new Font("Time New Roman",Font.BOLD,15));
      b2.setFont(new Font("Time New Roman",Font.BOLD,15));
      b2.addActionListener(this);
      b1.setBounds(220,400,120,40);
      b2.setBounds(350,400,120,40);
      b1.setFocusable(false);
      b2.setFocusable(false);
      l1=new JLabel("E-mail:");
      l2=new JLabel("Password:");
      pic=new JLabel();
      l1.setFont(new Font("Calibri body",Font.BOLD,20));
      l2.setFont(new Font("Calibri body",Font.BOLD,20));
      l1.setBounds(50,250,120,25);
      l2.setBounds(50,300,120,25);
      pic.setBounds(70,30,500,200);
      ImageIcon ic=new ImageIcon("LOGIN.png");
      pic.setIcon(ic);
      f.add(l1);
      f.add(l2);
      t1=new JTextField("");
      p1=new JPasswordField();
      t1.setBounds(200,250,150,25);
      p1.setBounds(200,300,150,25);
      t1.setFont(new Font("Times New Roman",Font.BOLD,15));
      p1.setFont(new Font("Times New Roman",Font.BOLD,15));
      che1=new JCheckBox("Show");
      che1.setFont(new Font("Calibri body",Font.BOLD,15));
      che1.setBounds(360,300,100,25);
      che1.setFocusable(false);
      che1.addActionListener(this);
      b1.addActionListener(this);
      war=new JLabel("Invalid details");
      war.setBounds(210,275,120,25);
      war.setFont(new Font("Times New Roman",Font.BOLD,18));
      war.setForeground(Color.red);
      war.setVisible(false);
      f.add(t1);
      f.add(p1);
      f.add(pic);
      f.add(che1);
      f.add(b1);
      f.add(b2);
      f.add(war);
      f.setBounds(200,200,500,500);
      f.setLayout(null);
      f.setVisible(true);
      f.setBackground(Color.DARK_GRAY);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
  }
    public static void main(String[] args) {
       new login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b2){
            new StartPage();
            f.dispose();
        }
        else if(e.getSource()==che1 && x==true){
            p1.setEchoChar('\0');
            x=false;
        }
        else if(e.getSource()==che1 && x==false){
            p1.setEchoChar('*');
            x=true;
        }
        if(e.getSource()==b1){
            war.setVisible(false);
            if(!match.checkMail(t1.getText()) ||!match.checkPassword(p1.getText()) || !new jdbc().checkMailPass(t1.getText(),p1.getText())){
                war.setVisible(true);
            }
            else{
                //new jdbc().checkMailPass(t1.getText(),p1.getText());
                f.dispose();
                new viewdetails(t1.getText());
            }
        }
    }
}
    

    
