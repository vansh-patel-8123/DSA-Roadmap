import java.util.Arrays;

public class RevArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(arr));
        rev(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void rev(int[] arr){
        int n = arr.length-1;
        for(int i=0; i<arr.length/2; i++){
            swap(arr,i,n-i);
        }
    }   
    public static void swap(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
