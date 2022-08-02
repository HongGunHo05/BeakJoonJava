import java.util.Scanner;

public class N4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testcase = sc.nextInt();

        for (int i = 0; i < testcase; i++) {
            int sum = 0;
            int[] num = new int[sc.nextInt()];

            for (int j = 0; j < num.length; j++) {
                num[j] = sc.nextInt();
                sum += num[j];
            }

            double avg = sum / (double) num.length;

            int count = 0;

            for (int j = 0; j < num.length; j++) {
                if (num[j] > avg) {
                    count++;
                }
            }

            avg = count / (double) num.length * 100;

            System.out.printf("%.3f%% \n", avg);
        }
    }
}
