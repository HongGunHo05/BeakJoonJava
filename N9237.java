import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class N9237 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 나무 수 입력

        String[] str = br.readLine().split(" "); // 각 나무마다 자라는 일 수 입력

        Integer[] arr = new Integer[n];

        for (int i = 0; i < n; i++) { // 정수로 바꿔준다
            arr[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(arr, Collections.reverseOrder()); //역 정렬을 해준다

        int max = 0; //제일 큰 수 구하기 위한 변수
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] + i + 1; // 나무가 자라기 위한 시간 + 다른 나무를 심는 시간 + 자신 나무 심는 시간
            if (arr[i] > max) max = arr[i];
        }

        System.out.println(max + 1); // 최대 시간 + 처음 일자(1)
    }
}
