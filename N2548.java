import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.util.Arrays.sort;

public class N2548 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }


        if(arr.length == 1) {
            System.out.println(arr[0]);
        }else{

            sort(arr);

            if (arr.length % 2 == 0) {
                System.out.println(arr[arr.length / 2 - 1]);
            } else {
                System.out.println(arr[arr.length / 2]);
            }
        }


    }
}
