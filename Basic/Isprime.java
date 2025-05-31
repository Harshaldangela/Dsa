public class Isprime {
    static boolean isPrime(int n) {
        // code here
        if(n<2){
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(2));  // true
        System.out.println(isPrime(3));  // true
        System.out.println(isPrime(4));  // false
        System.out.println(isPrime(17)); // true
        System.out.println(isPrime(18)); // false
        System.out.println(isPrime(19)); // true
        System.out.println(isPrime(20)); // false
    }
}

