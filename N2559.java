import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N2559 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];


        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

        int mx = Integer.MIN_VALUE; // -100000 가능

        for (int i = 0; i <= n - k; i++) {
            int check = 0;
            for (int j = i; j < i + k; j++) {
                check += arr[j];
            }

            if(mx < check){
                mx = check;
            }
        }

        System.out.println(mx);

    }
}
