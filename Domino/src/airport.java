import java.util.*;

public class airport {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] seats = new int[m];
        for (int i = 0; i < seats.length; i++) {
          seats[i] = sc.nextInt();
        }
        sc.close();
     
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        for (int i = 0; i < seats.length; i++) {
          if (seats[i] != 0) {
            maxHeap.add(-seats[i]);
            minHeap.add(seats[i]);
          }
        }
     
        long max = 0;
        for (int i = 0; i < n; i++) {
          int t = -maxHeap.poll();
          max += t;
          if (t - 1 != 0)
            maxHeap.add(-(t - 1));
        }
     
        long min = 0;
        for (int i = 0; i < n; i++) {
          int t = minHeap.poll();
          min += t;
          if (t - 1 != 0)
            minHeap.add(t - 1);
        }
     
        System.out.println(max + " " + min);

    }

}