import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N2477 {
    public static void main(String[] agrs) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        st.nextToken();

        int first = Integer.parseInt(st.nextToken());
        int pre = first;

        for (int i = 1; i < 6; i++) {
            st = new StringTokenizer(br.readLine());
            st.nextToken();
            int cur = Integer.parseInt(st.nextToken());
            max = Math.max(cur * pre, max);
            sum += cur * pre;
            pre = cur;
        }
        max = Math.max(pre * first, max);
        sum += pre * first;
        System.out.println((sum - max * 2) * K);
    }
}


