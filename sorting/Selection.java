import java.util.Scanner;

public class Selection{
    public static void selection_sort(int arr[],int n){
        for(int i=0;i<n-1;i++){
            int mini=i;
            for (int j = i+1; j < n; j++) {
                if(arr[j]<arr[mini]){
                    mini=j;
                } 
            }
            int temp=arr[mini];
                arr[mini]=arr[i];
                arr[i]=temp;
        }
        System.out.println("After Sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        selection_sort(arr, n);

        sc.close(); 
    }
}