import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N14425 {
    public static  void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] s = new String[n];

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            s[i] = st.nextToken();
        }

        int count = 0;
        String compare = "";
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            compare = st.nextToken();

            if(Arrays.asList(s).contains(compare)){
                count++;
            }
        }
        System.out.println(count);
    }
}
