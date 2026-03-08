public class CountWordInSentence {

    public static void main(String args[]){

        String sentence= "bagvhf   cf bncft  gftf  gdtd vttrs";
        int count = sentence.split("\\s+").length;
        System.out.println(count);

    }
}
