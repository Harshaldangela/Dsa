package Array.Easy;

import java.util.Scanner;

public class maxOne {

    private static int oneMax(int arr[],int n){
        int one=0,maxi=0;
        for (int i : arr) {
            if(i==1){
                one++;
            }else if(i==0){
                maxi=Math.max(maxi, one);
                one=0;
            }
        }
        maxi=Math.max(maxi, one);
        return maxi;
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
        System.out.println(oneMax(arr, n));
}
}