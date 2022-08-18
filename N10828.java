import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class N10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> st = new Stack<Integer>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            String[] p = s.split(" ");

            if (p[0].equals("push")) {
                st.push(Integer.parseInt(p[1]));
            } else if (p[0].equals("pop")) {
                if (st.empty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(st.pop());
                }
            } else if (p[0].equals("size")) {
                System.out.println(st.size());
            } else if (p[0].equals("empty")) {
                if (st.empty()) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            } else if (p[0].equals("top")) {
                if (st.empty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(st.peek());
                }
            }
        }

    }
}
