import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        double money;
        int month;
        double laisuat;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tien` gui: ");
        money = scanner.nextDouble();

        System.out.println("Nhap so thang gui: ");
        month = scanner.nextInt();

        System.out.println("Nhap lai suat: ");
        laisuat = scanner.nextDouble();

        double tongtienlai = 0;
        for (int i = 0; i < month; i++){
            tongtienlai += money * (laisuat/100)/12 * month;
        }
        System.out.println("Tong tien` lai cua ban la`: " + tongtienlai);
    }
}
