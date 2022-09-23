import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String[] s1 = st.nextToken().split("");
        String[] s2 = st.nextToken().split("");
        String n1 = "", n2 = "";
        for(int i = 2; i >=0; i--) {
            n1 += s1[i];
            n2 += s2[i];
        }
        System.out.println(Integer.parseInt(n1) >= Integer.parseInt(n2) ? n1 : n2);
    }
}
