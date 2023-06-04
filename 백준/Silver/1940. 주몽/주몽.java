import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] num = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        int i = 0;
        int j = N - 1;
        int count = 0;

        Arrays.sort(num);

        while (i < j) {
            if (num[i] + num[j] < M) i++;
            else if (num[i] + num[j] > M) j--;
            else {
                count++;
                i++;
                j--;
            }
        }
        System.out.println(count);
    }
}