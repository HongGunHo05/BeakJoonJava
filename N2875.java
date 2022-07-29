import java.util.Scanner;

public class N2875 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt(); // 여자, 남자, 필수 인원
        int count = 0; //팀 수
        while (n - 2 >= 0 && m - 1 >= 0 && (m + n) - 3 >= k) {
            /*
            * 여자 수와 남자 주는 수는 0보다 같거나 커야 하고
            * 필수 인원 보다 남녀 합이 작아지면 안 된다.*/
            n -= 2;
            m -= 1;
            count++;
        }
        System.out.println(count);
    }
}
