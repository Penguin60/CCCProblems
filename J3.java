import java.util.Arrays;
import java.util.Scanner;

public class J3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] xValue = new int[N];
        int[] yValue = new int[N];
        for(int i = 0; i < N; i++) {
            String n = sc.next();
            String[] temp = n.split(",");
            xValue[i] = Integer.parseInt(temp[0]);
            yValue[i] = Integer.parseInt(temp[1]);
        }
        Arrays.sort(xValue);
        Arrays.sort(yValue);
        int x1 = xValue[0] - 1;
        int y1 = yValue[0] - 1;
        int x2 = xValue[N-1] + 1;
        int y2 = yValue[N-1] + 1;

        System.out.println(x1 + "," + y1);
        System.out.println(x2 + "," + y2);
    }
}
