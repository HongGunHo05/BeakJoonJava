import java.util.Scanner;

public class N2588 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt(); // 첫번째 숫자 입력 받음
        int second = sc.nextInt(); // 두번째 숫자 입력 받음

        System.out.println(first * (second % 10)); // 두번째 숫자의 일의 자리와 곱한 수
        System.out.println(first * (second / 10 % 10)); // 두번째 숫자의 십의 자리와 곱한 수
        System.out.println(first * (second /100)); // 두번째 숫자의 백의 자리와 곱한 수
        System.out.println(first * second); // 최종으로 곱한 수
    }
}
