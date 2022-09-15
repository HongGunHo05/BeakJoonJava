import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        String l = st.nextToken();
        int re = 0;
        for (int i = 0; i < n; i++) {
            l.charAt(i);
            re += Integer.parseInt(String.valueOf(l.charAt(i)));
        }
        System.out.println(re);
    }
}
