import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Array
        int[] arrayname = new int[5];
        arrayname[0] = 5;
        arrayname[1] = 10;
        arrayname[2] = 15;
        System.out.println(arrayname[1]);

        String[] name = new String[5];
        name[1] = "Abcd";
        name[2] = "Defg";
        System.out.println(name[1]);
        

        // Input & output in Array
        
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[2];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int element : arr){
            System.out.println(element);
        }

        // 2D Array
        int[][] Arr2d = new int[3][2];
        for(int row = 0; row < Arr2d.length; row++){
            for(int col = 0; col < Arr2d[row].length; col++){
                Arr2d[row][col] = sc.nextInt();
            }
        }
        
        for(int[] ArrEle : Arr2d){
            System.out.println(Arrays.toString(ArrEle));
        }


        // ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        System.out.println(list.contains(10));
        list.remove(0);
        System.out.println(list);
        
        // Input & Output
        ArrayList<Integer> newList = new ArrayList<>();
        for(int i=0; i<5; i++){
            newList.add(sc.nextInt());
        }
        System.out.println(newList);


        // 2D ArrayList
        ArrayList<ArrayList<Integer>> list2d = new ArrayList<>();

        // initilisation
        for(int i = 0; i < 3; i++){
            list2d.add(new ArrayList<>());
        }
        // input
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++){
                list2d.get(i).add(sc.nextInt());
            }
        }
        // output
        System.out.println(list2d);

    }
}