import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class N10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());

        Deque<Integer> deq = new LinkedList<>();

        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            Integer n = 0;

            switch (st.nextToken()) {
                case "push_front":
                    deq.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    deq.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    n = deq.pollFirst();
                    if (n == null) sb.append(-1).append("\n");
                    else sb.append(n).append("\n");
                    break;
                case "pop_back":
                    n = deq.pollLast();
                    if (n == null) sb.append(-1).append("\n");
                    else sb.append(n).append("\n");
                    break;
                case "size":
                    sb.append(deq.size()).append("\n");
                    break;
                case "empty":
                    if (deq.isEmpty()) sb.append(1).append("\n");
                    else sb.append(0).append("\n");
                    break;
                case "front":
                    n = deq.peekFirst();
                    if (n == null) sb.append(-1).append("\n");
                    else sb.append(n).append("\n");
                    break;
                case "back":
                    n = deq.peekLast();
                    if (n == null) sb.append(-1).append("\n");
                    else sb.append(n).append("\n");
                    break;

            }
        }

        System.out.println(sb);
    }
}
