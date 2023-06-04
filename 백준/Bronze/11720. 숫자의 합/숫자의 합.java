import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int res = 0;

        for (byte value : br.readLine().getBytes()) {
            res += value - 48;
        }

        System.out.println(res);
    }
}