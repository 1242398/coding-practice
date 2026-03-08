import java.util.*;

public class Revese_A_Sentence {

    public static void main(String args[]) {
        String name = "my name is putul";
        //Set<String> set = new LinkedHashSet<>();
        String[] name1 = name.split("\\s+");
       for(int i=name1.length-1;i>=0;i--){
           System.out.print(" "+name1[i]);
       }


    }
    }


