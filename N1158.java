import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class N1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n1 = Integer.parseInt(s[0]);
        int n2 = Integer.parseInt(s[1]);

        Queue<Integer> qu = new LinkedList<>();

        for (int i = 1; i <= n1; i++) {
            qu.add(i);
        }

        int count = 1;

        System.out.print("<");
        while(qu.size() > 0) {
            if(count == n2){
                if(qu.size() != 1){
                System.out.print(qu.poll() + ", ");
                }else{
                    System.out.print(qu.poll());
                }
                count = 1;
            }else {
                qu.add(qu.poll());
                count++;
            }
        }
        System.out.println(">");
    }
}
