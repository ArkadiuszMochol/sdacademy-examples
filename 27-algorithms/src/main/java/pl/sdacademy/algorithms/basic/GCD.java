package pl.sdacademy.algorithms.basic;

public class GCD {

    public static void main(String[] args) {
        System.out.println(String.format("GCD dla %d i %d jest %d",
                35, 15, gcd2(35, 15)));
        System.out.println(String.format("GCD dla %d i %d jest %d",
                18, 16, gcd2(18, 16)));
        System.out.println(String.format("GCD dla %d i %d jest %d",
                100, 30, gcd2(100, 30)));
        System.out.println(String.format("GCD dla %d i %d jest %d",
                121, 33, gcd2(121, 33)));
    }

    public static int gcd(int x, int y) {
        int temp = 0;
        while(y != 0) {
            temp = x;
            x = y;
            y = temp % y;
        }
        return x;
    }

    public static int gcd2(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd2(y, x % y);
        }
    }

}
