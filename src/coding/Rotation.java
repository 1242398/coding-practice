package coding;

public class Rotation {

    public static void main(String args[]){
        String s1 = "abcd";
        String s2 = "cdab";
        int rorationCount=4;
        for(int i=0;i<rorationCount;i++){

        String result=stringRotate(s1);
        System.out.println(result);
        s1=result;

        }

    }

    public static String stringRotate(String rotate){
        char ch[]=  rotate.toCharArray() ;
        char lastChar= rotate.charAt(ch.length-1);
        String subString= rotate.substring(0,ch.length-1);
        String result =lastChar+subString;
        //System.out.println(result);

       return result;
    }
}
