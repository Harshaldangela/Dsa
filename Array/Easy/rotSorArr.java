package Array.Easy;

import java.util.Scanner;

public class rotSorArr {
    private static boolean check(int arr[],int n){
        int count=0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1]>arr[i]){
                count++;
            }
        }
        if(arr[n-1]>arr[0]){
            count++;
        }
        return count<=1;
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
        System.out.println(check(arr,n));
    }
}
