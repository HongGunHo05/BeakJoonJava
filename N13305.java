import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");

        long[] iarr = new long[n - 1];
        for (int i = 0; i < n - 1; i++) {
            iarr[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");

        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        long money = 0;
        long min = arr[0];

        for (int i = 0; i < n - 1; i++) {
            if (min >= arr[i]) {
                min = arr[i];
            }
            money += min * iarr[i];
        }
        System.out.println(money);
    }
}
