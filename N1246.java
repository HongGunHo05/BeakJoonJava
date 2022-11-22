import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N1246 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());

        int[] arr = new int[n2];

        for (int i = 0; i < n2; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int mx = 0;
        int mxnum = 0;

        for (int i = 0; i < n2; i++) {
            int sum = 0;
            int n = 0;

            for (int j = i; j < n2 && n < n1; j++) {
                sum += arr[i];
                n++;
            }
            if (sum > mx) {
                mx = sum;
                mxnum = arr[i];
            }
        }

        System.out.println(mxnum + " " + mx);
    }
}
