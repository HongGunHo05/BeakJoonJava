import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int start = n - (9 * String.valueOf(n).length());
        int result = 0;
        for (int i = start; i <= n; i++) {
            int total = 0, num = i;
            while (num > 0) {
                total += num % 10;
                num /= 10;
            }
            if (total + i == n) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
