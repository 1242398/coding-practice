import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicateAndReverse {
    public static void main(String args[]) {
        String name = "facebook messhow";
        String newName[] = name.split("\\s+");
        String rev = "";

        for (int i = 0; i < newName.length; i++) {
            for (int j = newName[i].length() - 1; j >= 0; j--) {
                char ch = newName[i].charAt(j);
                rev = rev + ch;
            }
            rev = rev + " ";
        }
        System.out.println(rev);
        String[] newRev = rev.split("\\s+");
        for (int i = 0; i < newRev.length; i++) {
            Set<Character> set = new LinkedHashSet<>();
            char word[] = newRev[i].toCharArray();
            for (char letters : word) {
                set.add(letters);

            }
            StringBuilder sb = new StringBuilder();
            {
                for (char ch_1 : set) {
                    sb.append(ch_1);
                }
                System.out.println("the output is:" + sb + " ");

            }

        }
    }
}