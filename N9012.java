import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class N9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            Stack<String> stack = new Stack<String>();
            st = new StringTokenizer(br.readLine());
            String[] bracket = st.nextToken().split("");

            for(String s : bracket) {
                if(stack.size() == 0){
                    stack.push(s);
                }else{
                    if(s.equals("(")){
                        stack.push(s);
                    }else{
                        if(stack.peek().equals("(")){
                            stack.pop();
                        }else {
                            stack.push(s);
                        }
                    }

                }
            }

            if(stack.size() == 0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }

    }
}
