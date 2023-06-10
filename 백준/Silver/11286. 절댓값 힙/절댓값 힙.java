import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> myQueue = new PriorityQueue<>((o1,o2)-> {
            //절댓값이 작은 순, 음수 먼저
            int firstAbs = Math.abs(o1);
            int secondAbs = Math.abs(o2);
            if (firstAbs == secondAbs) { // 절댓값이 같은 경우 음수 우선
                return o1 > o2 ? 1 : -1;
            }
            return firstAbs - secondAbs; // 절댓값 작은 데이터 우선
        }); // compareTo()는 에서 return이 양수이면 자리 교체, 음수 or 0이면 자리 유지

        for(int i = 0; i < N; i++) {
            int request = Integer.parseInt(br.readLine());
            if (request == 0) {
                if(myQueue.isEmpty()) {
                    System.out.println("0");
                } else {
                    System.out.println(myQueue.poll());
                }
            } else{
                myQueue.add(request);
            }
        }
    }
}