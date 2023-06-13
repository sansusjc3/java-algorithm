import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int A[] = new int[N.length()];
        for (int i = 0; i<N.length(); i++) {
            A[i] = Integer.parseInt(N.substring(i, i+1));
        }
        for (int i = 0; i<N.length(); i++) {
            int Max = i;
            for(int j = i+1; j < N.length(); j++) {
                if (A[j] > A[Max]) {
                    Max = j;
                }
            }
            if(A[i] < A[Max]) {
                int temp = A[i];
                A[i] = A[Max];
                A[Max] = temp;
            }
        }
        for(int i = 0; i<N.length(); i++) {
            System.out.print(A[i]);
        }
    }
}