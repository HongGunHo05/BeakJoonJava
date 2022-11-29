import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class N7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        HashSet<String> set = new HashSet<>();

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            String s1 = st.nextToken(), s2 = st.nextToken();

            if(s2.equals("enter")) set.add(s1);
            else if(s2.equals("leave")) set.remove(s1);
        }

        Iterator<String> it = set.iterator();
        List<String> list = new ArrayList<>();
        while(it.hasNext()) list.add(it.next());

        Collections.sort(list, Collections.reverseOrder());

        for(String s : list){
            System.out.println(s);
        }


    }
}
