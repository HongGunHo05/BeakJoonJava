import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N1267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int y = 30, m = 60;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        String[] arr = br.readLine().split(" ");

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i< n; i++){
            sum1 += (Integer.parseInt(arr[i]) / y * 10);
            if(( Integer.parseInt(arr[i]) - (Integer.parseInt(arr[i]) / y * y) ) % y >= 0){
                sum1 += 10;
            }

            sum2 += (Integer.parseInt(arr[i]) / m * 15);
            if(( Integer.parseInt(arr[i]) - (Integer.parseInt(arr[i]) / m * m) ) % m >= 0){
                sum2 += 15;
            }
        }

        if(sum1 == sum2){
            System.out.println("Y M "+ sum1);
        }else if(sum1 > sum2){
            System.out.println("M "+ sum2);
        }else System.out.println("Y "+ sum1);

    }
}
