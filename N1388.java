import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N1388 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        char[][] arr = new char[n][m];

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine().toCharArray();
        }

        int count = 0;
        int num;

        for (int i = 0; i < n; i++) {
            num = 0;
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == '|') num = 0;
                else if (++num == 1) count++;
            }
        }
        for (int j = 0; j < m; j++) {
            num = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i][j] == '-') num = 0;
                else if (++num == 1) count++;
            }
        }
        System.out.println(count);
    }

}


