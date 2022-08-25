import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class N1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String st = br.readLine();
        int length = st.length() - 1;
        String[] li = st.split("");
        int[] arr = new int[10];
        while (length >= 0) {
            if (Integer.parseInt(li[length]) == 9 || Integer.parseInt(li[length]) == 6) {
                if ((arr[9] + arr[6]) % 2 == 0) {
                    arr[Integer.parseInt(li[length])]++;
                } else {
                    if (arr[9] > arr[6]) {
                        arr[6]++;
                    } else arr[9]++;
                }
            } else {
                arr[Integer.parseInt(li[length])]++;
            }
            length -= 1;
        }
        int max = 0;

        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println(max);
    }
}
