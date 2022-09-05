import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2684 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        // 뒤뒤뒤, 뒤뒤앞, 뒤앞뒤, 뒤앞앞, 앞뒤뒤, 앞뒤앞, 앞앞뒤, 앞앞앞
        for (int i = 0; i < n; i++) {

            String[] arr = br.readLine().split("");
            String checkword = arr[0] + arr[1];
            int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, c6 = 0, c7 = 0, c8 = 0;

            for (int j = 2; j < arr.length; j++) {
                checkword += arr[j];
                switch (checkword) {
                    case "HHH":
                        c8++;
                        break;
                    case "HHT":
                        c7++;
                        break;
                    case "HTH":
                        c6++;
                        break;
                    case "HTT":
                        c5++;
                        break;
                    case "THH":
                        c4++;
                        break;
                    case "THT":
                        c3++;
                        break;
                    case "TTH":
                        c2++;
                        break;
                    case "TTT":
                        c1++;
                        break;
                }
                checkword = checkword.substring(1);
            }
            System.out.println(c1 + " " + c2 + " " + c3 + " " + c4 + " " + c5 + " " + c6 + " " + c7 + " " + c8);

        }


    }
}
