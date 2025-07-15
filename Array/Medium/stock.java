package Array.Medium;
import java.util.Scanner;

public class stock {
    private static int bestTime(int arr[],int n){
        int minValue=Integer.MAX_VALUE;
        int maxDiff=0;
        for (int i : arr) {
            minValue=Math.min(minValue,i);
            maxDiff=Math.max(i-minValue, maxDiff);
        }return maxDiff;
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
        System.out.println(bestTime(arr, n));
}
}
