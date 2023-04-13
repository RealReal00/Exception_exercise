import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Write a function to check if a String is an alternating sequence of letters and numbers (for example,
// * a0b3h4z1r4). The function delegates ParseException for notifying the caller about eventual malformations.
//* Note: Use can use Character.isDigit() and Character.isLetter() methods
public class Es_1 {

    private static void checkString(String s) throws ParseException {

        boolean waitingLetter = true;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c) && (waitingLetter)) {
                System.out.println("1");

               //throw new ParseException(s, i);
            }
            if (Character.isLetter(c) && (!waitingLetter)) {
                System.out.println("2");

                //throw new ParseException(s, i);
            }
            else{
                System.out.println("ok");
            }
            waitingLetter = !waitingLetter;
        }

    }
    public static void removeItems(List<String> strings)   {
        for (Iterator<String> i = strings.iterator(); i.hasNext(); ) {
            try {
                checkString(i.next());
            } catch (ParseException e) {

                i.remove();

            }
        }
    }
    public static void main(String args[]) throws ParseException /*throws ParseException*/{
        List<String> ls = new ArrayList<>();

        ls.add("a043");
        ls.add("b1c4");
        ls.add("2cd7");
        ls.add("c2d5");

        removeItems(ls);
        //checkString("a043");
        System.out.println(ls);


    }
}

