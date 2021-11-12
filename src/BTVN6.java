import java.util.Scanner;

public class BTVN6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result;
        int N = 1;

        while (N != 0) {
            System.out.println("Chào bạn đến với GAME AI LÀ TRIỆU PHÚ.\n" +
                    "\tLỚP C0921K1 CÓ BAO NHIÊU BẠN NỮ.\n");
            System.out.println("1. 1 ban");
            System.out.println("2. 2 ban");
            System.out.println("3. 3 ban");
            System.out.println("4. 4 ban");
            result = scanner.nextInt();

            switch (result) {
                case 1:
                case 2:
                case 4:
                    System.out.println("Sai roi`");
                    break;
                case 3:
                    System.out.println("Dung roi` ne`");
                    System.exit(0);
                    break;
            }
        }
    }
}
