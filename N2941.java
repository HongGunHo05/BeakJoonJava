import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] w = br.readLine().split("");

        int count = 0;

        for (int i = 0; i < w.length; i++) {

            if (w[i].equals("c") && i < w.length - 1) {

                if (w[i + 1].equals("=") || w[i + 1].equals("-")) {
                    i++;
                }

            } else if (w[i].equals("d") && i < w.length - 1) {

                if (w[i + 1].equals("-")) {
                    i++;
                } else if (w[i + 1].equals("z") && i < w.length - 2 && w[i + 2].equals("=")) {
                    i += 2;
                }

            } else if ((w[i].equals("l") || w[i].equals("n")) && i < w.length - 1) {

                if (w[i + 1].equals("j")) {
                    i++;
                }

            } else if ((w[i].equals("s") || w[i].equals("z")) && i < w.length - 1) {

                if (w[i + 1].equals("=")) {
                    i++;
                }
            }
            count++;
        }


        System.out.println(count);
    }
}
