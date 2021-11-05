import java.util.Scanner;

public class Snt20 {
    public static void main(String[] args) {
        int numbers;
        int count = 0;
        int N = 2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong SNT can hien: ");
        numbers = scanner.nextInt();

        while (count < numbers){
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(N); i++){
                if (N % i == 0){
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.println(N);
                count++;
            }
            N++;
        }
    }
}
//hien thi 20 SNT dau tien
