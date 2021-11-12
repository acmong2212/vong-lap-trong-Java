import java.util.Random;
import java.util.Scanner;

public class BTVN4 {
    public static void main(String[] args) {
        int number;
        int n = -1;
        int rd;

        Random random = new Random();
        rd = random.nextInt(11);

        Scanner scanner = new Scanner(System.in);


        while (n != 0) {
            System.out.println("Nhap vao` 1 so ma ban doan? (tu` 1 den 10)");
            number = scanner.nextInt();
            if (number < rd) {
                System.out.println("Nho hon roi`, nhap lai di");
            } else if (number > rd){
                System.out.println("Lon hon roi`, nhap lai di");
            } else {
                System.out.println("Chuc mung`, ban da doan dung!!!");
                System.exit(0);
                break;
            }
        }
    }
}
//Game doan so tu 1 den 10
