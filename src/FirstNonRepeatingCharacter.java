import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {


    public static void main(String[] args) {
        String input = "automation";
       // String input = "ppuutl";
        char[] result = input.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char ch : result) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
                //break;
            }
        }

        for (Map.Entry<Character, Integer> map1 : map.entrySet()) {
            if (map1.getValue()==1) {
                System.out.println("the key is:" + map1.getKey());
                break;
            }

        }
}}
