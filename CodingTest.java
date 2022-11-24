import java.util.Scanner;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class CodingTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());

        int result = 0;

        for (int i = 0; i < T; i++) {

            result = 0;

            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());

            int[] A = new int[N];
            int min = 0;

            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < N; j++) {
                A[j] = Integer.parseInt(st.nextToken());
                if (A[j] < min) {
                    min = A[j];
                }
            }

            if (A.length == 1) {
                result = A[0];


            } else {
                int count = 0;

                for (int j = 0; j < N; j++) {
                    if (j == 0) {
                        for (int k = 0; k < A.length; k++) {
                            if (A[k] == min && min < 0) {
                                continue;
                            } else if (k == A.length - 1 && A[k] < 0) {
                                continue;
                            } else {
                                result += A[k];
                            }
                        }
                    } else if (j == N - 1) {

                        boolean check = false;

                        for (int k = 0; k < A.length; k++) {

                            if (A[k] < 0 && k < A.length - 2 && check == false) {
                                continue;
                            } else if (k < A.length - 2 && check == false) {
                                check = true;
                                if (A[k] == min && min < 0) {
                                    continue;
                                } else {
                                    result += A[k];
                                }
                            } else if (A[k] > 0 && k < A.length - 2) {
                                if (A[k] == min && min < 0) {
                                    continue;
                                }
                                result += A[k];
                            } else {
                                if (A[k] == min && min < 0) {
                                    continue;
                                }
                                result += A[k];
                            }
                        }
                    } else {
                        boolean check = false;

                        for (int k = 0; k < A.length; k++) {

                            if (A[k] < 0 && check == false) {
                                continue;
                            } else if (A[k] > 0 && check == false) {
                                check = true;

                                result += A[k];

                            } else {
                                if (A[k] == min && min < 0) {
                                    continue;
                                }

                                result += A[k];

                            }

                        }

                    }


                }


            }
            if (result < 0) result *= -1;

            System.out.println("#" + (i + 1) + " " + (result % 1000000007));
        }
    }
}
