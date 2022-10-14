import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class N1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {


            Deque<Integer> deque = new LinkedList<>();
            Deque<Integer> indexdeque = new LinkedList<>();

            st = new StringTokenizer(br.readLine(), " ");

            int ncount = Integer.parseInt(st.nextToken());
            int numlocation = Integer.parseInt(st.nextToken());

            if (ncount == 1) {
                st = new StringTokenizer(br.readLine());
                System.out.println(1);
            } else {
                st = new StringTokenizer(br.readLine(), " ");
                int count = 0;

                for (int j = 0; j < ncount; j++) {
                    deque.add(Integer.parseInt(st.nextToken()));
                    indexdeque.add(j);
                }

                while (true) {
                    if (deque.peekFirst() != Collections.max(deque)) {
                        deque.add(deque.pollFirst());
                        indexdeque.add(indexdeque.pollFirst());
                    } else {
                        count++;
                        if (indexdeque.peekFirst() == numlocation) {
                            break;
                        } else {
                            deque.pollFirst();
                            indexdeque.pollFirst();
                        }
                    }
                }

                System.out.println(count);
            }


        }


    }
}
