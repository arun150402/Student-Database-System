package package1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Registration implements ActionListener{
    JFrame f;
    JTextField t2,t3,t4,t5,t6,t9,t10;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14;
    JLabel war1,war2,war3,war4,war5,war6;
    JRadioButton jb1,jb2,jb3;
    JComboBox jc1,jc2,jc3;
    JButton b1,b2;
    JCheckBox cb1,cb7,cb8;
    JPasswordField tp7,tp8;
    int flag=1;
    boolean x=true;
    boolean y=true;
    Registration()
    {
        f=new JFrame("Registration form");
        l1=new JLabel();
        l1=new JLabel("LET'S START THE REGISTRATION...");
        l1.setFont(new Font("Times New Roman",Font.BOLD,30));
        l1.setBounds(200,5,850,50);
        l1.setForeground(Color.RED);
        l2=new JLabel("First Name:");
        l3=new JLabel("Last Name:");
        l4=new JLabel("Father's Name:");
        l5=new JLabel("Mother's Name:");
        l6=new JLabel("E-mail:");
        l7=new JLabel("Enter Password:");
        l8=new JLabel("Re-enter Password:");
        l9=new JLabel("Gender:");
        l10=new JLabel("College:");
        l11=new JLabel("Department:");
        l12=new JLabel("Semester:");
        l2.setFont(new Font("Times New Roman",Font.BOLD,15));
        l3.setFont(new Font("Times New Roman",Font.BOLD,15));
        l4.setFont(new Font("Times New Roman",Font.BOLD,15));
        l5.setFont(new Font("Times New Roman",Font.BOLD,15));
        l6.setFont(new Font("Times New Roman",Font.BOLD,15));
        l7.setFont(new Font("Times New Roman",Font.BOLD,15));
        l8.setFont(new Font("Times New Roman",Font.BOLD,15));
        l9.setFont(new Font("Times New Roman",Font.BOLD,15));
        l10.setFont(new Font("Times New Roman",Font.BOLD,15));
        l11.setFont(new Font("Times New Roman",Font.BOLD,15));
        l12.setFont(new Font("Times New Roman",Font.BOLD,15));
        l2.setBounds(100,100,120,25);
        l3.setBounds(100,150,120,25);
        l4.setBounds(100,200,120,25);
        l5.setBounds(100,250,120,25);
        l6.setBounds(100,300,120,25);
        l7.setBounds(100,350,120,25);
        l8.setBounds(75,400,150,25);
        l9.setBounds(100,450,120,25);
        l10.setBounds(100,500,120,25);
        l11.setBounds(100,550,120,25);
        l12.setBounds(100,600,120,25);
        t2=new JTextField();//
        t3=new JTextField();
        t4=new JTextField();
        t5=new JTextField();
        t6=new JTextField();//
        tp7=new JPasswordField();//
        tp8=new JPasswordField();
        t2.setFont(new Font("Times New Roman",Font.BOLD,15));
        t3.setFont(new Font("Times New Roman",Font.BOLD,15));
        t4.setFont(new Font("Times New Roman",Font.BOLD,15));
        t5.setFont(new Font("Times New Roman",Font.BOLD,15));
        t6.setFont(new Font("Times New Roman",Font.BOLD,15));
        tp7.setFont(new Font("Times New Roman",Font.BOLD,15));
        tp8.setFont(new Font("Times New Roman",Font.BOLD,15));
        t2.setBounds(230,100,150,25);
        t3.setBounds(230,150,150,25);
        t4.setBounds(230,200,150,25);
        t5.setBounds(230,250,150,25);
        t6.setBounds(230,300,175,25);
        tp7.setBounds(230,350,150,25);
        tp8.setBounds(230,400,150,25);
        jb1=new JRadioButton("Male",true);
        jb2=new JRadioButton("Female");
        jb3=new JRadioButton("Others");
        jb1.setFocusable(false);
        jb2.setFocusable(false);
        jb3.setFocusable(false);
        jb1.setBounds(230,450,75,25);
        jb2.setBounds(330,450,75,25);
        jb3.setBounds(430,450,75,25);
        ButtonGroup bg=new ButtonGroup();
        bg.add(jb1);
        bg.add(jb2);
        bg.add(jb3);
        String arr1[]={"Select","PSG","KCT","CIT","SKCET","SKCT","AMRITA","KARPAGAM"};
        String arr2[]={"Select","ECE","EEE","CSE","IT","MCT","MECH"};
        String arr3[]={"Select","1","2","3","4","5","6","7","8"};
        jc1=new JComboBox(arr1);
        jc2=new JComboBox(arr2);
        jc3=new JComboBox(arr3);
        jc1.setBounds(230,500,100,25);
        jc2.setBounds(230,550,100,25);
        jc3.setBounds(230,600,100,25);
        jc1.setFocusable(false);
        jc2.setFocusable(false);
        jc3.setFocusable(false);
        b1=new JButton("Submit");
        b2=new JButton("Cancel");
        b1.setBounds(550,750,120,40);
        b2.setBounds(680,750,120,40);
        b1.setFocusable(false);
        b2.setFocusable(false);
        b1.setEnabled(false);
        b2.addActionListener(this);
        cb1=new JCheckBox("I Accept the above terms and conditions");
        cb1.setBounds(100,770,300,25);
        cb1.setFont(new Font("Times New Roman",Font.BOLD,15));
        cb1.setFocusable(false);
        cb7=new JCheckBox("Show");
        cb8=new JCheckBox("Show");
        cb7.setBounds(400,350,100,25);
        cb8.setBounds(400,400,100,25);
        cb7.setFocusable(false);
        cb8.setFocusable(false);
        l13=new JLabel("DOB:");
        l14=new JLabel("Mobile:");
        l13.setBounds(100,650,120,25);
        l14.setBounds(100,700,120,25);
        l13.setFont(new Font("Times New Roman",Font.BOLD,15));
        l14.setFont(new Font("Times New Roman",Font.BOLD,15));
        t9=new JTextField();//
        t10=new JTextField();//
        t9.setBounds(230,650,150,25);
        t10.setBounds(230,700,150,25);
        t9.setFont(new Font("Times New Roman",Font.BOLD,15));
        t10.setFont(new Font("Times New Roman",Font.BOLD,15));
        war1=new JLabel("*Invalid Name*");
        war2=new JLabel("*Invalid Email*");
        war3=new JLabel("*Invalid Password*");
        war4=new JLabel("*Password doesn't match*");
        war5=new JLabel("*Invalid DOB*");
        war6=new JLabel("*Invalid Mobile*");
        war1.setBounds(230,125,150,25);
        war1.setFont(new Font("Times New Roman",Font.BOLD,12));
        war1.setForeground(Color.RED);
        war2.setBounds(230,325,150,25);
        war2.setFont(new Font("Times New Roman",Font.BOLD,12));
        war2.setForeground(Color.RED);
        war3.setBounds(230,375,150,25);
        war3.setFont(new Font("Times New Roman",Font.BOLD,12));
        war3.setForeground(Color.RED);
        war4.setBounds(230,425,150,25);
        war4.setFont(new Font("Times New Roman",Font.BOLD,12));
        war4.setForeground(Color.RED);
        war5.setBounds(230,675,150,25);
        war5.setFont(new Font("Times New Roman",Font.BOLD,12));
        war5.setForeground(Color.RED);
        war6.setBounds(230,725,150,25);
        war6.setFont(new Font("Times New Roman",Font.BOLD,12));
        war6.setForeground(Color.RED);
        cb1.addActionListener(this);
        cb7.addActionListener(this);
        cb8.addActionListener(this);
        b1.addActionListener(this);
        war1.setVisible(false);
        war2.setVisible(false);
        war3.setVisible(false);
        war4.setVisible(false);
        war5.setVisible(false);
        war6.setVisible(false);
        f.setBounds(100,100,900,900);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBackground(Color.DARK_GRAY);
        f.add(l1);
        f.add(l2);f.add(l3);f.add(l4);f.add(l5);f.add(l6);f.add(l7);f.add(l8);f.add(l9);f.add(l10);f.add(l11);f.add(l12);f.add(l13);f.add(l14);
        f.add(t2);f.add(t3);f.add(t4);f.add(t5);f.add(t6);f.add(tp7);f.add(tp8);f.add(t9);f.add(t10);
        f.add(jb1);f.add(jb2);f.add(jb3);
        f.add(jc1);f.add(jc2);f.add(jc3);
        f.add(b1);f.add(b2);    
        f.add(cb1);f.add(cb7);f.add(cb8);
        f.add(war1);f.add(war2);f.add(war3);f.add(war4);f.add(war5);f.add(war6);
    }
    public static void main(String args[])
    {
        new Registration();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b2){
            new StartPage();
            f.dispose();
        }
        if(e.getSource()==b1){
            if(match.checkName(t2.getText()) && match.checkMail(t6.getText()) 
                    && match.checkPassword(tp7.getText()) && match.checkdob(t9.getText()) 
                    && match.checkPhone(t10.getText()) && tp7.getText().equals(tp8.getText()))
               {
                war1.setVisible(false);
                war2.setVisible(false);
                war3.setVisible(false);
                war4.setVisible(false);
                war5.setVisible(false);
                war6.setVisible(false);
                StringBuffer sb=new StringBuffer();
                     sb.append("'"+(t2.getText())+"'");
                     sb.append(convertStr(t3.getText()));
                     sb.append(convertStr(t4.getText()));
                     sb.append(convertStr(t5.getText()));
                     sb.append(convertStr(t6.getText()));
                     sb.append(convertStr(tp8.getText()));
                     String gender;
                     if(jb1.isSelected()){
                         gender="Male";
                     }
                     else if(jb2.isSelected()){
                         gender="Female";
                     }
                     else{
                         gender="Others";
                     }
                     sb.append(convertStr(gender));
                     sb.append(convertStr((String)jc1.getSelectedItem()));
                     sb.append(convertStr((String)jc2.getSelectedItem()));
                     sb.append(convertStr((String)jc3.getSelectedItem()));
                     sb.append(convertStr(t9.getText()));
                     sb.append(convertStr(t10.getText()));
                     System.out.println(sb);
                     new jdbc().insertValues(sb.toString());
                     JOptionPane.showMessageDialog(f,"Successfully Submitted");
                     f.dispose();
                     new login();
                 }
            else{
                if(match.checkName(t2.getText())==false)
                    war1.setVisible(true);
                else
                    war1.setVisible(false);
                if(match.checkMail(t6.getText())==false)
                        war2.setVisible(true);
                else
                        war2.setVisible(false);
                if(match.checkPassword(tp7.getText())==false)
                        war3.setVisible(true);
                else
                        war3.setVisible(false);
                if(match.checkdob(t9.getText())==false)
                        war5.setVisible(true);
                else
                        war5.setVisible(false);
                if(match.checkPhone(t10.getText())==false)
                       war6.setVisible(true);
                else
                       war6.setVisible(false);
                if(!tp7.getText().equals(tp8.getText()))
                       war4.setVisible(true); 
                else
                       war4.setVisible(false);
            }
        }
        if(e.getSource()==cb1 && flag==1){
            b1.setEnabled(true);
            flag=0;
          }
          else if(e.getSource()==cb1 && flag==0){
            b1.setEnabled(false);
            flag=1;
           }
         if(e.getSource()==cb7 && x==true){
            tp7.setEchoChar('\0');
            x=false;
          }
          else if(e.getSource()==cb7 && x==false){
            tp7.setEchoChar('*');
            x=true;
           }
         if(e.getSource()==cb8 && y==true){
            tp8.setEchoChar('\0');
            y=false;
          }
          else if(e.getSource()==cb8 && y==false){
            tp8.setEchoChar('*');
            y=true;
           }
        }
    public static StringBuffer convertStr(String s){
         String ans=",'";
         ans+=s;
         ans+='\'';
         return new StringBuffer(ans);
         }
 }