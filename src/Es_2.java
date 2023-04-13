//Write a function to remove from a List<String> all the strings which are not an alternating
// sequence of
// letters
//* and numbers (for example, a0b3h4z1r4).
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Es_2 {
    private static void rimuovi(List<String> ls) {
        int cnt = 0;
        boolean check = true;

        try {
            for (String s : ls) {
                String str = s;
                for (int i = 0; i < str.length(); i++) {
                    char ca = str.charAt(i);
                    if (Character.isDigit(ca) && check) {
                        throw new ParseException(str, i);
                    }
                    if (Character.isLetter(ca) && !check) {
                        throw new ParseException(str, i);
                    }
                    check = !check;

                }
                cnt++;
            }
        } catch (ParseException e) {
            ls.remove(cnt);
        }
    }



    public static void main(String args[]) {
        List<String> ls = new ArrayList<>();

        ls.add("a0b3");
        ls.add("b1c4");
        ls.add("2cd7");
        ls.add("c2d5");

        rimuovi(ls);
        System.out.println(ls);


    }


}
