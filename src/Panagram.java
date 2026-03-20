import java.util.HashMap;
import java.util.Map;

public class Panagram {


    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        String s1=s.replaceAll("\\s+","");
        String s2=s1.toLowerCase();
        System.out.println(s1);
        char ch[]=s2.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(char ch1:ch){
            if(map.containsKey(ch1)){
                map.put(ch1,map.get(ch1)+1);

            }else {
                map.put(ch1, 1);
            }
        }
        System.out.println(map.size());
        if(map.size()==26){
            System.out.println("This is panagram");
        }else{
            System.out.println("This is not panagram");
        }
    }
}
