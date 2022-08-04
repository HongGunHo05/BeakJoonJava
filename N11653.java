import java.util.Scanner;

public class N11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 2;

        while (n != 1) {

            if (n % count != 0) {
                count++;
            } else {
                n /= count;
                System.out.println(count);
                count = 2;
            }
        }
    }
}
