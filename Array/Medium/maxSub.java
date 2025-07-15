package Array.Medium;

import java.util.Scanner;

public class maxSub {
    private static int sub(int arr[],int n){
        int curSum=arr[0],maxSum=arr[0];
        for (int i=1;i<n;i++) {
            curSum=Math.max(arr[i],curSum+arr[i]);
            maxSum=Math.max(maxSum, curSum);
        }
        return maxSum;
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
        System.out.println(sub(arr, n));
}
}
