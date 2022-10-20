import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int count = 0;

        Integer[] arr = new Integer[n];

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }


        for (int i = n-1; i >= 0; i--) {
            if (m >= arr[i]) {
                int c = m / arr[i];
                count += c;
                m -= arr[i] * c;
            }
            if (m == 0) {
                break;
            }

        }
        System.out.println(count);

    }
}
