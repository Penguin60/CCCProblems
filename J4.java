import java.util.Scanner;

public class J4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String T = sc.next();
        String S = sc.next();
        for(int i = 0; i < S.length()+1; i++) {
            if(T.contains(S)) {
                System.out.println("yes");
                break;
            } else if (i >= S.length()) {
                System.out.println("no");
                break;
            }
            S = S.substring(1) + "" + S.substring(0,1);
        }
    }
}
