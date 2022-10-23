import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N1541 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String[] arr = br.readLine().split("-");

        int total = 0;
        int c = 1;
        int result = 0;

        if (arr.length == 1) {
            for (String i : arr[0].split("\\+")) {
                result += Integer.parseInt(i);
            }
        } else {
            if (arr[0].contains("+")) {
                for (String i : arr[0].split("\\+")) {
                    result += Integer.parseInt(i);
                }
            } else {
                result += Integer.parseInt(arr[0]);
            }

            while (c < arr.length) {
                if (arr[c].contains("+")) {
                    for (String i : arr[c].split("\\+")) {
                        total += Integer.parseInt(i);
                    }
                } else {
                    total = Integer.parseInt(arr[c]);
                }
                result -= total;
                total = 0;
                c++;
            }

        }
        System.out.println(result);
    }

}
