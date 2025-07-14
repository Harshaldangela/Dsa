package Array.Easy;

import java.util.Scanner;

public class secLargest {
    public static int sec(int arr[]){
        int first=-1,second=-1;
        for(int i:arr){
            if(i>first){
                second=first;
                first=i;
            }else if(i>second && i!=first){
                second=i;
            }
        }
        return second;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array Element:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(sec(arr));
    }
}
