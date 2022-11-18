import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class N1159 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        char[] arr = new char[n];

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine().charAt(0);
        }

        Arrays.sort(arr);

        String s = "";

        for (int i = 0; i < (n - 1); i++) {
            int count = 0;
            for (int j = (i + 1); j < n; j++) {

                if (arr[i] == arr[j] && arr[i] != '0') {
                    count++;
                    arr[j] = '0';
                }
            }
            if (count > 3) {
                s += arr[i];
            }
        }
        if (s.equals("")) {
            System.out.println("PREDAJA");
        } else {
            System.out.println(s);
        }

    }
}
