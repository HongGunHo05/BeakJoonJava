import java.util.Arrays;
import java.util.Scanner;

public class N1546 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        double[] a = new double[n];
        double total = 0;

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextDouble();
        }

        Arrays.sort(a);

        for (int i = 0; i < n; i++) {
            total += a[i] / a[a.length - 1] * 100;
        }

        System.out.println(total / a.length);
    }
}
