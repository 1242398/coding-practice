import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateInSTring {

    public static void main (String args[]) {
        String name = "putulpal";
        Set<Character> set= new LinkedHashSet<>();
        for(char ch: name.toCharArray()){
            set.add(ch);
        }

        StringBuilder result = new StringBuilder();
        for(char ch:set){
            result.append(ch);
        }

        System.out.println("After removal duplicate "+result);
    }



}
