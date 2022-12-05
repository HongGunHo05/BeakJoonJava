import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N17451 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        long[] v = new long[n];
        for (int i = 0; i < n; i++) {
            v[i] = Long.parseLong(st.nextToken());
        }

        long s = v[n - 1];
        for (int i = n - 2; i >= 0; i--) {

            if(s % v[i] == 0){
                continue;
            }

            if (s < v[i]) {
                s = v[i];
            } else if (v[i] < s) {

                s = ((s / v[i]) + 1) * v[i];

            }

        }

        System.out.println(s);

    }
}
