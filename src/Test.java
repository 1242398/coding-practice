import java.util.*;

public class Test {

    public static void main(String args[]) {
        String name = "putulpal";
        Set<Character>  set= new LinkedHashSet<>();
        for(char ch:name.toCharArray()){
            set.add(ch);
        }
        StringBuilder sb= new StringBuilder();
       for(char ch1:set){
           sb.append(ch1);
       }
       System.out.println(sb);
    }

}
