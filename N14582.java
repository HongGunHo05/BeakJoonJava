import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N14582 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        String[] s1 = br.readLine().split(" "), s2 = br.readLine().split(" ");

        int sum1 = 0, sum2 = 0;
        int c = 0;

        for (int i = 0; i < 9; i++) {
            sum1 += Integer.parseInt(s1[i]);

            if (sum1 > sum2) {
                c = 1;
            }

            sum2 += Integer.parseInt(s2[i]);
        }

        if (c == 1)
            sb.append("Yes");
        else sb.append("No");

        System.out.println(sb);
    }
}
