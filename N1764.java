import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class N1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");
        int i1 = Integer.parseInt(arr[0]);
        int i2 = Integer.parseInt(arr[1]);
        String s;

        Set<String> ar1 = new HashSet<String>();
        ArrayList<String> total = new ArrayList<String>();

        for (int i = 0; i < i1; i++) {
            ar1.add(br.readLine());
        }

        for (int i = 0; i < i2; i++) {
            s = br.readLine();
            if (ar1.contains(s)) {
                total.add(s);
            }
        }

        Collections.sort(total);

        System.out.println(total.size());
        for (int i = 0; i < total.size(); i++) {
            System.out.println(total.get(i).toString());
        }
    }
}
