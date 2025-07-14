package Array.Easy;

import java.util.Scanner;

public class missingNo {
    private static int missing(int arr[],int n){

        // Approach-1
        int sum=n*(n+1)/2;
        for(int i:arr){
            sum-=i;
        }return sum;


        // Approach-2
        // int xor1=0;
        // int xor2=0;
        // for (int i : arr) {
        //     xor1^=i;
        // }
        // for (int i=1;i<=n;i++) {
        //     xor2^=i;
        // }
        // return xor1^xor2;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(missing(arr, n));
    }
}
