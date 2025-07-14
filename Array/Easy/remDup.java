package Array.Easy;

import java.util.Scanner;
import java.util.TreeSet;

public class remDup {
    private static int dup(int arr[],int n){
        // int count=1;
        // for(int i=1;i<n;i++){
        //     if(arr[i-1]!=arr[i]){
        //         arr[count]=arr[i];
        //         count++;
        //     }
        // }return count;
        TreeSet<Integer> set=new TreeSet<>();
        for (int i : arr) {
            set.add(i);
        }return set.size();
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
        System.out.println(dup(arr,n));
    }
}
