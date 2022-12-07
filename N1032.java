import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        char[] p = br.readLine().toCharArray();

        for (int i = 0; i < n - 1; i++) {
            char[] fileName = br.readLine().toCharArray();
            for (int j = 0; j < p.length; j++) {
                if(p[j] != fileName[j]) p[j] = '?';
            }
        }
        System.out.println(p);
    }
}