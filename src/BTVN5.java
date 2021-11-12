import java.util.Scanner;

public class BTVN5 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        double denta;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a: ");
        a = scanner.nextInt();
        System.out.println("Nhap b: ");
        b = scanner.nextInt();
        System.out.println("Nhap c: ");
        c = scanner.nextInt();

        denta = Math.pow(b, 2) - 4 * a * c;
        if (denta < 0) {
            System.out.println("Phuong trinh vo nghiem: " + denta + " < 0");
        } else if (denta == 0) {
            System.out.println("Phuong trinh co nghiem kep: x1 = x2 = " + -b / 2 * a);
        } else {
            System.out.println("Phuong trinh co 2 nghiem phan biet: " + denta + " > 0");
        }
    }
}
//Giai phuong trinh bac 2 nhap vao a, b, c