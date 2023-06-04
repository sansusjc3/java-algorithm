import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int maxV = 0;
        int res = 0;

        for (int i = 0; i < N; i++){
            int score = Integer.parseInt(st.nextToken());
            if (score > maxV) {
                maxV = score;
            }
            res += score;
        }

        System.out.println(res * 100.0 / maxV / N);
    }
}