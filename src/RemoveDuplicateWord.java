import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWord {

    public static void main(String args[]){

        String setnece= "my  kolkata name is putul is name kolkata";
        String words[]=  setnece.split("\\s+");
        Set<String> set= new LinkedHashSet<>();
        for(String word:words){
            set.add(word);
        }
 String result = String.join(" ",set);
        System.out.println(result);
    }
}
