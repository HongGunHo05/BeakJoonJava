import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class N1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        LinkedList<Integer> deq = new LinkedList<>();
        LinkedList<Integer> outdeq = new LinkedList<>();

        while (n > 0) {
            deq.addFirst(n);
            n--;
        }

        int count = 0;

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < m; i++) {
            outdeq.add(Integer.parseInt(st.nextToken()));
        }

        while (true) {
            if (outdeq.isEmpty()) break;

            if (deq.peekFirst() == outdeq.peekFirst()) {
                deq.pollFirst();
                outdeq.pollFirst();
            } else if (deq.indexOf(outdeq.peekFirst()) <= deq.size() / 2) {
                deq.add(deq.pollFirst());
                count++;
            } else {
                deq.addFirst(deq.pollLast());
                count++;
            }
        }
        System.out.println(count);
    }
}
