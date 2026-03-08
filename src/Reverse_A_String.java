public class Reverse_A_String {

    public static void main(String args[])
    {
        String name= "Hello Word";
        String rev= "";

        for (int i=name.length()-1;i>=0; i--){
            rev = rev+name.charAt(i);

    }
        System.out.println(rev);
        if(name.equals(rev)){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }
    }
}
