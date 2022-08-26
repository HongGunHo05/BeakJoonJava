import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2869 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");
        int n1 = Integer.parseInt(s[0]);
        int n2 = Integer.parseInt(s[1]);
        int n3 = Integer.parseInt(s[2]);
        int count = 0;

        if (n1 == n3) {
            System.out.println(1);
        } else {
            count = (n3 - n2) / (n1 - n2);

            if ((n3 - n2) % (n1 - n2) != 0) {
                count++;
            }
            System.out.println(count);
        }
    }
}
