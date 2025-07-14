package Array.Easy;

import java.util.Scanner;

public class largest {
    public static int lar(int arr[],int n){
        int maxi=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            maxi=Math.max(maxi, arr[i]);
        }
        return maxi;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(lar(arr,n));
    }
}
