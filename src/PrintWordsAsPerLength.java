import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PrintWordsAsPerLength {

public static void main(String args[]){

    String name = "my name is putul pal putull gfd";
    String names[] = name.split("\\s+");
    Map<Integer, List<String>> map = new TreeMap<>();
    for (String word : names) {
        int size= word.length();
        if(map.containsKey(size)) {
            List<String> list=  map.get(size);
            list.add(word);
            map.put(size,list);
        }
        else{
            List<String> newlIst= new ArrayList<>();
            newlIst.add(word);
            map.put(size,newlIst);
        }


    }

    for(Map.Entry<Integer, List<String>> map1:map.entrySet()){
        System.out.print(map1.getValue());
    }
}
}

