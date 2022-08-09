import java.util.Scanner;

public class N2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt(); // 카드 숫자 개수, 상한선 입력 받음
        int[] num = new int[n]; // 입력 받은 숫자들을 넣기 위한 배열
        int max = 0; // 최댓 숫자를 넣기 위한 변수

        for (int i = 0; i < num.length; i++) { //카드 숫자 만큼 돌때
            num[i] = sc.nextInt(); // 숫자 입력 받음
        }

        for (int i = 0; i < num.length; i++) { // 처음부터 배열 길이 만큼 돌때
            for (int j = i + 1; j < num.length; j++) { //i 보다 1 크게 돌고
                for (int k = j + 1; k < num.length; k++) { // j 보다 1 크게 돈다
                    int total = num[i] + num[j] + num[k]; //3개 합이 총 합 변수에 들어간다
                    if (total > max && total <= m) { // 만약 총합이 최대 변수보다 크면서 상한선 보다 작다면
                        max = total; // 최대 변수에 넣어준다
                    }
                }
            }
        }
        System.out.println(max); //결과 출력
    }
}
