import java.util.ArrayList;

public class Alldiv {
    public int[] divisors(int n) {
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                res.add(i);
            }
        }
        int result[]=new int[res.size()];
        for(int i=0;i<res.size();i++){
            result[i]=res.get(i);
        }
        return result;
    }
    public static void main(String[] args) {
        Alldiv ad = new Alldiv();
        int[] result = ad.divisors(12);
        for (int num : result) {
            System.out.print(num + " "); // Output: 1 2 3 4 6 12
        }
    }
}