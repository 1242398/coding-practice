import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {

    public static void main(String args[]){

        String string1 = "silent";
        String string2 = "listen";

        char[] arra1= string1.toCharArray();
        char[] arra2= string2.toCharArray();
        Arrays.sort(arra1);
        Arrays.sort(arra2);
//        System.out.println(arra1);
//        System.out.println(arra2);
        if(Arrays.equals(arra1,arra2)){
            System.out.println("This is anagram");
        } else{
            System.out.println("This is not anagram");
        }
    }

}
