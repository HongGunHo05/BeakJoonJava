import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");
        //숫자를 문자열 형태로 입력 받아 배열에 넣음

        int n1 = Integer.parseInt(s[0]); // 각 숫자를 정수형으로 변환
        int n2 = Integer.parseInt(s[1]);
        int[] arr = new int[n2]; // 배열 크기를 정함

        int count = 0; //배열 위치 세기 위해 , 결과를 출력 하기 위해

        for (int i = 1; ; i++) { //1 부터 무한으로 돌면서
            for (int j = 0; j < i; j++) { // 배열 0의 자리부터 채워준다
                arr[count] = i;
                count++;
                if (count == n2) {
                    //위치가 끝까지 갔다면 멈춘다(배열 길이가 count와 같다는 의미)
                    break;
                }
            }
            if (count == n2) {
                break;
            }
        }

        count = 0; //결과 출력 하기 위해 0으로 초기화

        for (int i = n1 - 1; i < n2; i++) {
            count += arr[i]; //원하는 위치 만큼 더해준다
        }
        System.out.println(count); //결과 출력
    }

}
