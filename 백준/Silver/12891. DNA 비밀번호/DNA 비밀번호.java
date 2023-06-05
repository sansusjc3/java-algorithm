import java.io.*;
import java.util.*;
public class Main {

    static int curArr[];
    static int checkArr[];
    static int checkRes;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int result = 0;
        checkArr = new int[4];
        curArr = new int[4];
        char dna[] = new char[S];
        checkRes = 0;
        dna = br.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
            if (checkArr[i] == 0) {
                checkRes++;
            }
        }

        for (int i=0; i < P; i++) {
            Add(dna[i]);
        }

        if (checkRes == 4) result++;

        for (int i=P; i<S; i++) {
            int j = i-P;
            Add(dna[i]);
            Remove(dna[j]);
            if (checkRes == 4) result++;
        }
        System.out.println(result);
    }
    private static void Add(char c) {
        switch (c) {
            case 'A':
                curArr[0]++;
                if(curArr[0] == checkArr[0]) checkRes++;
                break;
            case 'C':
                curArr[1]++;
                if(curArr[1] == checkArr[1]) checkRes++;
                break;
            case 'G':
                curArr[2]++;
                if(curArr[2] == checkArr[2]) checkRes++;
                break;
            case 'T':
                curArr[3]++;
                if(curArr[3] == checkArr[3]) checkRes++;
                break;
        }
    }
    private static void Remove(char c) {
        switch (c) {
            case 'A':
                if(curArr[0] == checkArr[0]) checkRes--;
                curArr[0]--;
                break;
            case 'C':
                if(curArr[1] == checkArr[1]) checkRes--;
                curArr[1]--;
                break;
            case 'G':
                if(curArr[2] == checkArr[2]) checkRes--;
                curArr[2]--;
                break;
            case 'T':
                if(curArr[3] == checkArr[3]) checkRes--;
                curArr[3]--;
                break;
        }
    }
}