public class SEtenceEveryWordRev {

    public static void main(String args[]){
    String name = "my name is putul";
    String[] name1= name.split("\\s+");
    String rev= "";
        for(int i=0;i<name1.length;i++){
        for(int j=name1[i].length()-1;j>=0;j--){
            rev= rev+name1[i].charAt(j);
        }
        rev= rev+ " ";
    }

        System.out.print(rev);
}
}
