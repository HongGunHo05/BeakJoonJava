import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringTokenizer
        // token은 쪼가리로 나눠 진 것을 의미
        // String 타입으로 token을 만들어 넣어라

        int n = Integer.parseInt(st.nextToken()); // 숫사 수
        int m = Integer.parseInt(st.nextToken()); // 몇번 할 것인지

        st = new StringTokenizer(br.readLine()); // 숫자를 입력 받아 문자열 쪼가리로 담아 st에 담는다

        int[] arr = new int[n + 1]; // 차차 더해질 수를 담기 위해 만든 배열

        for (int i = 1; i <= n; i++) {
            // 현재 배열 = 전 배열 안에 담긴 수 + 새로 입력 된 수
            // 진행 된 곳 까지의 합이 배열에 들어간다
            arr[i] = arr[i - 1] + Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < m; i++) { // 입력 받은 진행 시킬 수 까지
            st = new StringTokenizer(br.readLine()); // 수를 입력 받음
            int n1 = Integer.parseInt(st.nextToken()); // 시작점
            int n2 = Integer.parseInt(st.nextToken()); // 끝 점
            System.out.println(arr[n2] - arr[n1 - 1]); // 끝점까지의 총합 - 시작점까지의 총합
        }

    }
}
