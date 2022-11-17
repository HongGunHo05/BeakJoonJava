import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");

        int n1 = Integer.parseInt(arr[0]);
        int n2 = Integer.parseInt(arr[1]);
        int[][] narr0 = new int[n1][n2];
        int[][] narr1 = new int[n1][n2];

        int n = 0;

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < n1; j++) {
                String[] str = br.readLine().split(" ");
                for (int k = 0; k < n2; k++) {
                    if (n == 0) {
                        narr0[j][k] = Integer.parseInt(str[k]);
                    } else narr1[j][k] = Integer.parseInt(str[k]);
                }
            }
            n++;
        }

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(narr0[i][j] + narr1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
