package package1;
import java.sql.*;
public class jdbc {
    void insertValues( String s){
        try{
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","xxx","yyy");
            Statement  st = con.createStatement();
            String query ="insert into studentlist values("+s+")";
            st.executeUpdate(query);
            con.setAutoCommit(true);
            con.close();
            System.out.println("Success!");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    static boolean checkMailPass(String s,String ss){
        try{
            System.out.println("hi hello");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","xxx","yyy");
            Statement  st = con.createStatement();
            //System.out.println(s);
            String query="select * from studentlist where emailid='"+s+"'";
            //System.out.println(query);
            ResultSet rs=st.executeQuery(query);
            rs.next();
            //System.out.println(rs.getString("password"));
            if(rs.getString("password").equals(ss)){
                return true;
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        return false;
    }
    static String[] extractdata(String s){
        System.out.println(s);
        String a[]=new String[12];
        try{
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","xxx","yyy");
            Statement  st = con.createStatement();
            ResultSet rs=st.executeQuery("select * from studentlist where emailid='"+s+"'");
            rs.next();
            a[0]=rs.getString("firstname");
            a[1]=rs.getString("lastname");
            a[2]=rs.getString("fname");
            a[3]=rs.getString("mname");
            a[4]=rs.getString("emailid");
            a[5]=rs.getString("password");
            a[6]=rs.getString("gender");
            a[7]=rs.getString("college");
            a[8]=rs.getString("department");
            a[9]=rs.getString("semester");
            a[10]=rs.getString("dob");
            a[11]=rs.getString("mob");
           /* for(String ss:a){
                System.out.println(ss);
            }*/
            con.setAutoCommit(true);
            con.close();
            System.out.println("Success!");
        }
        catch(Exception e){
            System.out.println(e);
        }
        return a;
    }
    void update(String s,String mail){
        try{
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","xxx","yyy");
            Statement  st = con.createStatement();
            String query ="update studentlist "+s+" where emailid='"+mail+"'";
            st.executeUpdate(query);
            con.setAutoCommit(true);
            con.close();
            System.out.println("Details updated");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
   public static void main(String args[]){
       //String xx[]=new jdbc().extractdata("19euec049@gmail.com");
   }
    
}
