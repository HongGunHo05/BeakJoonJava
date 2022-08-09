import java.util.Scanner;

public class N1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String w = sc.next(); //단어 입력 받음
        w = w.toUpperCase(); // 대문자 문자열로 만들어 줌

        String[] sw = new String[w.length()]; // 입력받은 문자열의 길이 크기를 가진 배열
        sw = w.split(""); // 문자열을 나눠 배열로 넣어줌

        int[] count = new int[26]; //대분자 갯수 만큼 정수형 배열 만듬

        for (int i = 0; i < sw.length; i++) { // 문자열 배열 만큼 돌면서
            count[sw[i].charAt(0) - 'A']++; //대문자 'A'를 빼주고 정수형 배열의 위치에 + 1을 한다. (아스키코드 이용)
        }

        int max = 0; //제일 많은 것을 세기 위해
        char word = '?'; // 결과 출력 하기 위해

        for (int i = 0; i < count.length; i++) { //정수형 배열 만큼 돌때
            if (count[i] > max) { // 정수형 배열의 위치에 있는 수가 더 크다면
                max = count[i]; // 최고 수 바꾼다.
                word = (char) (i + 'A'); // 결과 출력 하기 위한 변수에 'A'를 더해주고 넣어준다.
            } else if (count[i] == max) { // 결과가 같을 경우
                word = '?'; // 결과 출력 하기 위한 변수에 ?를 넣어준다.
            }
        }
        System.out.println(word); // 결과 출력

    }
}
