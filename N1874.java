import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class N1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        String result = "";

        int max = 0;
        int c = 1;

        Stack<Integer> deq = new Stack<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());

            while (c <= num) {
                deq.add(c);
                result += "+";
                c++;
            }
            if (deq.peek() == num) {
                deq.pop();
                result += "-";
            } else {
                result = "NO";
            }

        }

        if (result.equals("NO")) {
            System.out.println(result);
        } else {
            for (String i : result.split("")) {
                System.out.println(i);
            }
        }
    }
}
