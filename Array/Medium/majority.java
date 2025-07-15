package Array.Medium;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class majority {
    private static int majo(int arr[],int n){
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>n/2){
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
        System.out.println(majo(arr, n));
}
}