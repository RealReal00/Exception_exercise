import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

/**
 * Write a function receiving two strings as parameters and returning true if the first date is before the second
 * date. The function uses the SimpleDateFormat and java.util.Date classes. Eventual exceptions are delegated to
 * the caller.
 */

public class Es_4 {


    private static boolean check(String str1,String str2)  {
        SimpleDateFormat reader= new SimpleDateFormat("dd.MM.yyyy");
        try {
            Date d1 = reader.parse(str1);
            Date d2 = reader.parse(str2);
            return d1.after(d2);
        }
        catch(ParseException e){
            return false;
        }


    }

    public static void main(String args[])  {


        String str2="16.07.2000";
        String str1="05.10.1968";
        System.out.print(check(str1,str2));

    }
}