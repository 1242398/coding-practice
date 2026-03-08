import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Array_3rd_Highest {

    public static void main(String args[]){

        int arr[]={23,24,1,7,8,28,35};
        Set<Integer> set= new TreeSet<>();

        for(Integer i:arr){
            set.add(i);
        }
        List<Integer> list= new LinkedList<>(set);
        int thirdrd_highest_no= list.get(list.size()-3);
        System.out.println(thirdrd_highest_no);
        int max= list.get(list.size()-1);
        System.out.println(max);

        int min= list.get(0);
        System.out.println(min);



    }
}
