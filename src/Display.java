import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int draw = -1;
        int k = 0;

        while (draw != 0) {
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle bottom-left");
        System.out.println("3. Print the square triangle top-left");
        System.out.println("4. Print isosceles triangle");
        System.out.println("5. Exit");
        System.out.println("Enter the picture you want to draw: ");
        draw = input.nextInt();

        switch (draw) {
            case 1:
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j <= 7; j++) {
                        System.out.print("* ");
                    }
                    System.out.println(" ");
            } break;
            case 2:
                for (int i = 1; i <= 6; i++){
                    for (int j = 1; j < i; j++){
                        System.out.print("* ");
                    }
                    System.out.println("");
                } break;
            case 3:
                for (int i = 5; i >= 1; i--){
                    for (int j = 1; j <= i; j++){
                        System.out.print("* ");
                    }
                    System.out.println(" ");
                } break;
            case 4:
                for (int i = 1; i <= 7; i++, k = 0){
                    for (int j = 1; j <= 7 - i; j++){
                        System.out.print("  ");
                    }
                    while (k != 2 * i - 1){
                        System.out.print("* ");
                        k++;
                    }
                    System.out.println();
                }
            case 5:
                System.exit(0);
            default:
                System.out.println("No draw!");
        }
    }
}
}
