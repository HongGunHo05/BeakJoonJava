import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = 0;
        int result = 0;

        for(int i = 1; count < n; i++) {
            if(Integer.toString(i).contains("666")){
                count++;
                result = i;
            }
        }
        System.out.println(result);

    }
}
