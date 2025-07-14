package Array.Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class union {
    private static int[] uni(int arr1[],int arr2[],int n,int m){
        HashSet<Integer> set=new HashSet<>();
        for (int i : arr1) {
            set.add(i);
        }
        for (int i : arr2) {
            set.add(i);
        }
        int res[]=new int[set.size()];
        int ind=0;
        for (int i:set) {
            res[ind++]=i;
        }
        return res;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Array 1:");
        int n=sc.nextInt();
        int arr1[]=new int[n];
        System.out.println("Enter Array:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter Size of Array 2:");
        int m=sc.nextInt();
        int arr2[]=new int[m];
        System.out.println("Enter Array:");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]=sc.nextInt();
        }
        int result[]=uni(arr1, arr2, n, m);
        System.out.println(Arrays.toString(result));
}
}