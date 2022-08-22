import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class N1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        Map<String, String> map1 = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            map1.put(word, Integer.toString(i + 1));
            map1.put(Integer.toString(i + 1), word);
        }

        for (int i = 0; i < m; i++) {
            System.out.println(map1.get(br.readLine()));
        }

    }
}
