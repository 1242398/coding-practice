public class ArrayZeroMovement {

    public static void main(String args[])
    {
        int arr[]= {1,0,3,0,5,0,3,7,8};
        int pos= 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp =arr[i];
                arr[i]=arr[pos];
                arr[pos]=temp;
                pos++;
            }

        }
        for(int num:arr){
            System.out.print(num+" ");

        }
    }
}
