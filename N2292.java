import java.util.Scanner;

public class N2292 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1, start = 1;

        while(start < n){
            start += count * 6;
            count++;
        }
        System.out.println(count);
    }
}
