public class BinaryAdd {
    public static void main(String[] args) {

        String  s1 = "1101";
        String s2 = "111";
        int num1= Integer.parseInt(s1,2);
        System.out.println(num1);
        int num2= Integer.parseInt(s2,2);
        System.out.println(num2);
        int sum = num1+num2;
        String res= Integer.toBinaryString(sum);
        System.out.println(res);


    }
}
