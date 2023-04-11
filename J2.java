import java.util.Scanner;

public class J2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int N = sc.nextInt();
        int R = sc.nextInt();
        int sum = N;
        int i = 0;
        while(sum <= P) {
            i++;
            sum += N*R;
            N *= R;
        }
        System.out.println(i);
    }


}
