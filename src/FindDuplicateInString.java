import java.util.HashMap;
import java.util.Map;

public class FindDuplicateInString {

    public static void main(String args[])
    {
         String name = "ttessst@innn123ggg!";

         Map<Character,Integer> map = new HashMap<>();

         for(char ch: name.toCharArray()){
             if(map.containsKey(ch)){
                 map.put(ch,map.get(ch)+1);
             }else{
                 map.put(ch,1);
             }
         }

       for(Map.Entry<Character,Integer> entry:map.entrySet()){
           System.out.println("key is:"+entry.getKey()+"Value is:"+entry.getValue());
//           if(entry.getValue()>1){
//               System.out.println("key is:"+entry.getKey()+"Value is:"+entry.getValue());
//           }
       }

    }
}
