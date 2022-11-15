import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] arr = br.readLine().split(" ");

        int compare = Integer.parseInt(br.readLine());

        int count = 0;
        for(int i = 0; i < n; i++){
            if(Integer.parseInt(arr[i]) == compare) count++;
        }

        System.out.println(count);
    }
}
