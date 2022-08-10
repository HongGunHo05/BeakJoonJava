import java.util.Scanner;

public class N5585 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1000 - sc.nextInt();
        int count = 0;
        int[] money = {500, 100, 50, 10, 5, 1};

        for (int i = 0; i < money.length; i++) {
            while (n - money[i] >= 0) {
                n -= money[i];
                count++;
            }
        }

        System.out.println(count);
    }
}
