public class BTVN1 {
    public static void main(String[] args) {
        int count = 0;
        int i = 11;
        while (count < 20) {
            if (i % 5 == 0) {
                count++;
            }
            i++;
        }
        System.out.println(i - 1);
    }
}
