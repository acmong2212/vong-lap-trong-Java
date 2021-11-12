public class BTVN2 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 10; i < 50; i++) {
            if (isPrimeNumber(i)) {
                sum += i;
                System.out.println(i);
            }
        }
        System.out.println(sum);
    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}