import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        String[] numbers = br.readLine().split(" ");
        int[] sum = new int[N+1];
        for (int i = 1; i <= N; i++) {
            sum[i] = sum[i-1] + Integer.parseInt(numbers[i-1]);
        }

        for (int i = 0; i < M; i++) {
            input = br.readLine().split(" ");
            int start = Integer.parseInt(input[0]);
            int end = Integer.parseInt(input[1]);
            bw.write(Integer.toString(sum[end] - sum[start-1]));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
