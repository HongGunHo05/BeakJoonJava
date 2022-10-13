import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class N11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());

        Deque<Integer> deque = new LinkedList<>();

        for (int i = 1; i <= n1; i++) {
            deque.add(i);
        }
        System.out.print("<");

        int c = 0;
        while (deque.size() > 1) {
            if (c == n2) {
                System.out.print(deque.pollLast() + ", ");
                c = 0;
            } else {
                deque.add(deque.pollFirst());
                c++;
            }
        }

        System.out.println(deque.poll() + ">");

    }
}
