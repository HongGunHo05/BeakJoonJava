import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class N10773 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//
//        st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//
//        Stack<Integer> stack = new Stack<Integer>();
//
//        int sum = 0;
//
//        for (int i = 0; i < n; i++) {
//            st = new StringTokenizer(br.readLine());
//            int num = Integer.parseInt(st.nextToken());
//
//            if(num == 0) {
//                stack.pop();
//            }else stack.push(num);
//        }
//
//        for(int i = 0; i < stack.size(); i++) {
//            sum += stack.pop();
//        }
//
//        System.out.println(sum);
//    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        Stack<Integer> stack = new Stack<Integer>();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());

            if (num == 0) {
                sum -= stack.peek();
                stack.pop();
            } else {
                sum += num;
                stack.push(num);
            }
        }

        System.out.println(sum);
    }
}

