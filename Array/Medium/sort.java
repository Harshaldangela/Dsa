package Array.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class sort {

    private static void color(int arr[],int n){
        int zero=0,one=0,two=0;
        for (int i : arr) {
            if(i==0) zero++;
            else if(i==1) one++;
            else two++;
        }
        int ind=0;
        while (zero>0) {
            arr[ind++]=0;
            zero--;
        }
        while (one>0) {
            arr[ind++]=1;
            one--;
        }
        while (two>0) {
            arr[ind++]=2;
            two--;
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
        color(arr, n);
        System.out.println(Arrays.toString(arr));
    }
}


