import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N10815 {
    static String[] arr;
    static String[] findarr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        arr = br.readLine().split(" ");
        Arrays.sort(arr);

        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());

        findarr = br.readLine().split(" ");

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int findnum = compare(Integer.parseInt(st.nextToken()));

            System.out.println(findnum + " ");
        }
    }

    // 중앙을 기준으로 위치 인덱스에서 + 1 또는 - 1 해야 됨
    static int compare(int num) {
        int re = 0;
        int left = 0, right = arr.length - 1, m = (left + right) / 2;





        return re;
    }


}
