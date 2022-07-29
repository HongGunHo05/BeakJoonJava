import java.util.Scanner;

public class N2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int si = sc.nextInt(), bun = sc.nextInt(); // 시, 분 입력 받음
        int newbun = bun - 45; // 분에서 45를 빼줌


        if (newbun < 0) { // 45를 빼준 분이 0보다 작을 경우
            bun = newbun + 60; // 60을 더해주면서 현재 분을 구한다.
            if (si == 0) { // 시가 0일 경우
                si = 23; // 23시로 만들어 준다.
            } else si -= 1; // 다른 경우는 시에서 1을 빼준다.
        } else bun = newbun; // 45를 빼준 분이 0보다 같거나 크다면 그대로 적용 시킨다.

        System.out.print(si + " "); // 결과 출력
        System.out.print(bun);

    }
}
