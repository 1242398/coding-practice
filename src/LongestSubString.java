public class LongestSubString {

    public static void main(String[] args) {
        String name = "programming";
        char ch[] =name.toCharArray();
        String result="";
        for(int i=0;i<ch.length;i++){
            char letter=ch[i];
            String subset=""+letter;
            for(int j=i+1;j<ch.length;j++){
                String nextLetter=""+ch[j];
                if(subset.contains(nextLetter)){
                    break;
                }else{
                    subset=subset+ nextLetter;
                }

            }
            if(subset.length()>result.length()) {
                result = subset;

            }

        }
        System.out.println(result);

    }
}
