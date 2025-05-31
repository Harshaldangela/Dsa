class Revno {
    public static  int reverse(int x) {
        int a1 = 0;
        while (x != 0) {
            int dig = x % 10;
            if (a1 > Integer.MAX_VALUE / 10 || a1 < Integer.MIN_VALUE / 10) {
                return 0;
            }
            a1 = a1 * 10 + dig;
            x /= 10;
        }
        return a1;
    }
    public static void main(String[] args) {
        System.out.println(reverse(123));
    }
}