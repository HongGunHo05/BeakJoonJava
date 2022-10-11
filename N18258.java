import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class N18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        Deque<Integer> queue = new LinkedList<>();

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()) {
                case "push":
                    queue.add(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    Integer pop = queue.poll();
                    if (pop == null) {
                        sb.append(-1).append("\n");
                    } else sb.append(pop).append("\n");
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    if (queue.isEmpty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                case "front":
                    Integer peek = queue.peek();
                    if (peek == null) {
                        sb.append(-1).append("\n");
                    } else sb.append(peek).append("\n");
                    break;
                case "back":
                    Integer peekLast = queue.peekLast();
                    if (peekLast == null) {
                        sb.append(-1).append("\n");
                    } else sb.append(peekLast).append("\n");
                    break;
                default:
                    break;
            }
        }
        System.out.println(sb);
    }
}
