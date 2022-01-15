package package1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class StartPage implements ActionListener{
   JFrame f;
   JLabel hi,ques1,ques2;
   JButton log,sign;
   StartPage()
   {
       f=new JFrame("Start Page");
       ImageIcon icon=new ImageIcon("WELCOME.png");
       hi=new JLabel("Welcome to our Site..");
       hi.setFont(new Font("Calibri body",Font.BOLD,25));
       hi.setIcon(icon);
       hi.setBounds(120,20,300,200);
       hi.setHorizontalTextPosition(JLabel.CENTER);
       hi.setVerticalTextPosition(JLabel.BOTTOM);
       ques1=new JLabel("Already registered?");
       ques2=new JLabel("Don't have an Account?");
       log=new JButton("Login");
       sign=new JButton("Sign Up");
       ques1.setFont(new Font("Calibri body",Font.BOLD,20));
       ques2.setFont(new Font("Calibri body",Font.BOLD,20));
       ques1.setBounds(80,260,200,25);
       log.setBounds(300,260,100,25);
       ques2.setBounds(50,320,230,25);
       sign.setBounds(300,320,100,25);
       log.setFocusable(false);
       sign.setFocusable(false);
       log.addActionListener(this);
       sign.addActionListener(this);
       f.setBounds(300,300,600,600);
       f.setLayout(null);
       f.setVisible(true);
       f.setBackground(Color.darkGray);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f.add(hi);
       f.add(ques1);
       f.add(ques2);
       f.add(log);
       f.add(sign);
   }
    public static void main(String args[])
    {
        new StartPage();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==log){
            new login();
            f.dispose();
        }
        if(e.getSource()==sign){
            new Registration();
            f.dispose();
        }
    }   
}
