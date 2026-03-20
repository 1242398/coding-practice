import java.util.HashMap;
import java.util.Map;

public class NonRepeatingChar {


    public static void main(String[] args) {

        String name= "automation";
        char s[]= name.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(char letter:s){
            if(map.containsKey(letter)){
                map.put(letter,map.get(letter)+1);
            }else{
                map.put(letter,1);
            }
        }
        for(Map.Entry<Character,Integer> map1:map.entrySet()){
            if(map1.getValue()==1){
                System.out.print(map1.getKey());
            }
        }
    }
}
