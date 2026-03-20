public class VowelConsonant {

    public static void main(String[] args) {

        String input= "programming";
        int vowel=0;
        int constant=0;
        // char ch[]= input.toCharArray();
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='0'||ch=='u'){
                vowel ++;
            }else{
                constant++;
            }
        }
        System.out.println("The vowel is: "+vowel+" The consonant is "+constant);

    }
}
