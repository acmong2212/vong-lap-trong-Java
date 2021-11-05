import java.util.Scanner;

public class Snt100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        number = scanner.nextInt();

        if (number < 2) {
            System.out.println(number + " Khong phai la so nguyen to");
        }
        for (int i = 2; i < number; i++){
            if (isPrimeNumber(i)){
                System.out.println(" " + i);
            }
        }
    }

    public static boolean isPrimeNumber(int n) {
        if(n < 2) {
            return false ;
        }
        for (int i = 2 ; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
//hien thi cac so nguyen to nho hon 100