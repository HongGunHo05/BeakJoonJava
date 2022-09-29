import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N1331 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        boolean bl = true;
        String[] arr = new String[37];

        st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        arr[0] = s;
        String[] pre = s.split("");
        char pre1 = pre[0].charAt(0);
        int pre2 = Integer.parseInt(pre[1]);

        for (int i = 1; i < 37; i++) {

            if (i < 36) {
                st = new StringTokenizer(br.readLine());
                s = st.nextToken();

                if (Arrays.asList(arr).contains(s)) {
                    bl = false;
                    break;
                }
            } else {
                s = arr[35];
                pre = arr[0].split("");
                pre1 = pre[0].charAt(0);
                pre2 = Integer.parseInt(pre[1]);
            }

            String[] srr = s.split("");

            char s1 = srr[0].charAt(0);
            int s2 = Integer.parseInt(srr[1]);


            if (s1 - 2 == pre1 || s1 + 2 == pre1) {
                if (s2 + 1 == pre2 || s2 - 1 == pre2) {

                } else {
                    bl = false;
                    break;
                }
            } else if (s1 - 1 == pre1 || s1 + 1 == pre1) {
                if (s2 == pre2 - 2 || s2 == pre2 + 2) {

                } else {
                    bl = false;
                    break;
                }
            } else {
                bl = false;
                break;
            }

            arr[i] = s;
            pre1 = s1;
            pre2 = s2;

        }


        if (bl) {
            System.out.println("Valid");
        } else System.out.println("Invalid");

    }
}
