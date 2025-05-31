public class Palindrome {
    public boolean isPalindrome(int x) {
        int a1 = x;
        int a = 0;
        if (x < 0) {
            return false;
        }
        while (x != 0) {
            int dig = x % 10;
            a = a * 10 + dig;
            x /= 10;
        }
        return a1 == a;
    }
    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        System.out.println(p.isPalindrome(121)); // true
        System.out.println(p.isPalindrome(-121)); // false
        System.out.println(p.isPalindrome(10)); // false
        System.out.println(p.isPalindrome(12321)); // true
    }
}

