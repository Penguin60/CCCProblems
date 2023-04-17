import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;

public class J5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String solvable = "no";
        int M = Integer.parseInt(reader.readLine());
        int N = Integer.parseInt(reader.readLine());
        int[][] room = new int[M + 1][N + 1];
        for (int i = 1; i <= M; i++) {
            String[] temp = reader.readLine().split(" ");
            for(int j = 1; j <= N; j++) {
                room[i][j] = Integer.parseInt(temp[j - 1]);
            }
        }
        int[][] step = new int[M + 1][N + 1];
        for (int[] row: step) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        step[M][N] = 1;
        LinkedList<Integer> rowQueue = new LinkedList<>();
        LinkedList<Integer> columnQueue = new LinkedList<>();
        rowQueue.add(M);
        columnQueue.add(N);
        while (!rowQueue.isEmpty()) {
            int row = rowQueue.poll();
            int column = columnQueue.poll();
            int check = row * column;
            for (int i = 1; i <= M; i++) {
                for (int j = 1; j <= N; j++) {
                    if (room[i][j] == check && i == 1 && j == 1) {
                        solvable = "yes";
                        break;
                    }
                    if (room[i][j] == check && step[i][j] > step[row][column] + 1) {
                        rowQueue.add(i);
                        columnQueue.add(j);
                        step[i][j] = step[row][column] + 1;
                    }
                }
            }
        }
        System.out.println(solvable);
    }
}
