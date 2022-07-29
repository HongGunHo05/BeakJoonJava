import java.util.Scanner;

public class N1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), count = 0; //숫자 입력, 횟수 초기화
        int num = -1; // 더해지면서 비교할 수

        int a = n;
        while (num != n) {
            num = (a % 10) * 10 + ((a % 10) + (a / 10)) % 10; //십의 자리 일의 자리 구해서 더해준다
            count++; //횟수 추가
            a = num;
        }

        System.out.println(count);
    }
}
