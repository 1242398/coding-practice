package coding;

public class RorateArray {

    public static void main(String args[]) {
        int input[] = {1, 2, 3, 4, 5, 6, 7};
        int rorationCount = 2;
        for (int i = 0; i < rorationCount; i++) {
            int result[] = arrayRotate(input);
            input = result;
        }
        for(int i=0;i<input.length;i++){
            System.out.print(input[i]);
        }

    }
    public static int[] arrayRotate(int[] input){

        int newArray[]= new int[input.length];
        newArray[0]=input[input.length-1];
        for(int i=0;i<input.length-1;i++){
            newArray[i+1]=input[i];

        }

        return newArray;
    }

}

