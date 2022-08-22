import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class N11399 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int total = 0, count = 0;
        int[] it = new int[n];

        for (int i = 0; i < it.length; i++) {
            it[i] = sc.nextInt();
        }
        Arrays.sort(it);

        for (int i = 0; i < it.length; i++) {
            total += it[i];
            count += total;
        }

        System.out.println(count);
    }
}
