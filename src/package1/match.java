package package1;
import java.util.regex.*;
public class match{
       public static boolean checkName(String s){
        if(s.length()==0){
            return false;
        }
        String pat="^[A-Z][a-zA-Z]{2,20}$";
        return Pattern.matches(pat,s);
    }
    public static boolean checkPhone(String ph){
        if(ph.length()==0){
            return false;
        }
        String pat="^[6-9][0-9]{9}$";
        return Pattern.matches(pat,ph);
    }
    public static boolean checkMail(String mail){
        if(mail.length()==0){
            return false;
        }
        String pat="^[A-Za-z0-9+_.-]+@(.+)$";
        return Pattern.matches(pat,mail);
    }
    public static boolean checkPassword(String pass){
        String pat="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$";
        return Pattern.matches(pat,pass);
    }
    public static boolean checkdob(String pass){
        String pat="^[0-9]{1,2}\\/[0-1]?[0-9]\\/[0-9]{4}";
        return Pattern.matches(pat,pass);
    }
  } 
