package package1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class update extends Registration implements ActionListener{
   // JButton save;
    boolean x=true;
    boolean y=true;
    update(String arr[]){
        f.setBounds(300,100,900,900);
        l1.setText("LET'S UPDATE YOUR DETAILS...");
        l1.setForeground(Color.BLUE);
        f.setTitle("Update from");
        for(String xx:arr)
            System.out.println(xx);
        t2.setText(arr[0]);t3.setText(arr[1]); t4.setText(arr[2]);t5.setText(arr[3]); t6.setText(arr[4]);tp7.setText(arr[5]);
        tp8.setText(arr[5]);t9.setText(arr[10]);t10.setText(arr[11]);
        t6.setEditable(false);
        jb1.setEnabled(true);
        jb2.setEnabled(true);
        jb3.setEnabled(true);
        if(arr[6].equals("Male"))
            jb1.setEnabled(true);
        else if(arr[6].equals("Female"))
            jb2.setEnabled(true);
        else if(arr[6].equals("Others"))
            jb3.setEnabled(true);
        b1.setText("Update");
        cb1.setVisible(false);cb1.setEnabled(false);
        b1.setEnabled(true);
        b1.addActionListener(this);
        cb7.addActionListener(this);
        cb8.addActionListener(this);
}
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b2){
            new viewdetails(t6.getText());
            f.dispose();
        }
        else if(e.getSource()==b1){
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
                     StringBuffer sb = new StringBuffer("set ");
                     sb.append("firstname='" + (t2.getText()) + "'");
                     sb.append(",lastname='"+t3.getText()+"'");
                     sb.append(",fname='"+t4.getText()+"'");
                     sb.append(",mname='"+t5.getText()+"'");
                     sb.append(",emailid='"+t6.getText()+"'");
                     sb.append(",password='"+tp8.getText()+"'");
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
                     sb.append(",gender='"+gender+"'");
                     sb.append(",college='"+(String)jc1.getSelectedItem()+"'");
                     sb.append(",department='"+(String)jc2.getSelectedItem()+"'");
                     sb.append(",semester='"+(String)jc3.getSelectedItem()+"'");
                     sb.append(",dob='"+t9.getText()+"'");
                     sb.append(",mob='"+t10.getText()+"'");
                     System.out.println(sb);
                     new jdbc().update(sb.toString(),t6.getText());
                     JOptionPane.showMessageDialog(null,"Successfully Updated");
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
        else if(e.getSource()==cb7 && x==true){
            tp7.setEchoChar('\0');
            cb7.setVisible(false);
            x=false;
          }
          else if(e.getSource()==cb8 && y==true){
            tp8.setEchoChar('\0');
            cb8.setVisible(false);
            y=false;
          }

        }
  
    public static void main(String args[]){
        //new update("19euec049@gmail.com");
    }
    }
