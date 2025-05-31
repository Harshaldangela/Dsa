public class Gcd {
    public static int gcd(int a, int b) {
        // code here
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        System.out.println(gcd(48, 18)); // Output: 6
        System.out.println(gcd(56, 98)); // Output: 14
        System.out.println(gcd(101, 10)); // Output: 1
        System.out.println(gcd(0, 5)); // Output: 5
        System.out.println(gcd(5, 0)); // Output: 5
    }
}


