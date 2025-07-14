package Array.Easy;

import java.util.Scanner;

public class rotate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter place:");
        int k=sc.nextInt();
        System.out.println("Enter Size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        rot(arr,n,k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void rot(int[] arr, int n, int k) {
        k=k%n;
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[(i+k)%n]=arr[i];
        }
        for (int i = 0; i < nums.length; i++) {
            arr[i]=nums[i];
        }
    }
}
