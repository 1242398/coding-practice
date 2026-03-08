import java.util.*;

public class AnagraArray {

    public static void main(String args[]) {

        String[] arr = {"ate", "tea", "bat", "eat", "abt", "goat", "oagt", "ogta","syafdg"};
        Map<String, List<String>> map = new LinkedHashMap<>();
        for (String word : arr) {
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(word);
        }
        System.out.println(map.values());


    }
    }


