import java.util.Scanner;

public class N1252 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n1 = sc.next(), n2 = sc.next();

        int t1 = Integer.parseInt(n1, 2), t2 = Integer.parseInt(n2, 2);

        t1 += t2;

        n1 = Integer.toBinaryString(t1);

        System.out.println(n1);


    }
}
