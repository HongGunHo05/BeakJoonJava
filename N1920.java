import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N1920 {

    static int[] arr1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        arr1 = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr1);

        int n2 = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n2; i++) {
            int s = Integer.parseInt(st.nextToken());

            if (solution(s) == 1) {
                System.out.println(1);
            } else System.out.println(0);

        }

    }

    public static int solution(int k) {
        int low = 0;
        int high = arr1.length - 1;

        while (high >= low) {
            int mid = (high + low) / 2;
            if (arr1[mid] == k) {
                return 1;
            } else if (arr1[mid] > k) {
                high = mid - 1;
            } else if (arr1[mid] < k) {
                low = mid + 1;
            }
        }
        return 0;
    }
}