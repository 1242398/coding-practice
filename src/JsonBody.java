import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class JsonBody {

//    {
//        "id": 1,
//        "name": "putul",
//        "city": ["bangalore", "Chennai"]
//        }


    public static void main(String args[]){

        Map<String,Object> map=new LinkedHashMap<>();
        map.put("id",1);
        map.put("name","putul");
        List<String> cities = new ArrayList<>();
        cities.add("bangalore");
        cities.add("Chennai");
        map.put("city",cities);
        System.out.println(map);


    }
}
