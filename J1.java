import java.util.Scanner;

public class J1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int one = sc.nextInt();
        int two = sc.nextInt();
        int three = sc.nextInt();

        int score = one + two * 2 + three * 3;

        if(score >= 10){
            System.out.println("happy");
        } else {
            System.out.println("sad");
        }
    }
}
