package Array.Medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class twoSum {
    private static int[] sum(int arr[],int n,int target){
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(arr[i]+arr[j]==target){
        //             return new int[]{i,j};
        //         }
        //     }
        // }return new int[]{-1,-1};

        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<n;i++) {
            if(map.containsKey(target-arr[i])){
                return new int[]{map.get(target-arr[i]),i};
            }
            map.put(arr[i],i);
        }return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Target: ");
        int tar=sc.nextInt();
        System.out.println("Enter Size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int res[]=sum(arr, n,tar);
        System.out.println(Arrays.toString(res));
    }
}
