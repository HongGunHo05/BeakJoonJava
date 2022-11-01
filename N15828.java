import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class N15828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String str = br.readLine();
        st = new StringTokenizer(str);

        int n = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();

        while(true){
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            if(num == -1) break;

            if(n == queue.size() && num != 0){
                continue;
            }else{
                if(num == 0){
                    queue.remove();
                }else {
                    queue.add(num);
                }
            }
        }

        if(queue.size() == 0){
            System.out.println("empty");
        }else {
            while(!queue.isEmpty()){
                System.out.print(queue.poll() + " ");
            }
        }
    }
}
