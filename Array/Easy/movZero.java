package Array.Easy;

import java.util.Scanner;

public class movZero {
    public static void mov(int arr[],int n){
        int nums[]=new int[n];
        int ind=0;
        for (int i = 0; i < nums.length; i++) {
            if(arr[i]!=0){
                nums[ind++]=arr[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            arr[i]=nums[i];
        }
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
        mov(arr,n);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
