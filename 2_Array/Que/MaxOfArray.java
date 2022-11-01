public class MaxOfArray {
    public static void main(String[] args) {
        int[] arr = {3,6,4,7,431,42,5};
       
        System.out.println( max(arr));
    }    
    public static int max(int[] arr){
        int max = arr[0];
        for(int element : arr){
            if(element > max){
                max = element;
            }
        }
        return max;
    }
}
