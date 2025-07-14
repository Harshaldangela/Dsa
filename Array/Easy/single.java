package Array.Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class single {

    private static int sing(int arr[],int n){
        //Approach-1

        // Arrays.sort(arr);
        // for (int i = 1; i < arr.length; i+=2) {
        //     if(arr[i-1]!=arr[i]){
        //         return arr[i-1];
        //     }
        // }return arr[n-1];

        // Approach-2
        // int ans=0;
        // for(int i:arr){
        //     ans^=i;
        // }return ans;

        // Approach-3
        HashMap<Integer,Integer> map=new HashMap();
        for (int i : arr) {
            map.put(i,map.getOrDefault(i, 0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }return -1;
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(sing(arr, n));
}
}