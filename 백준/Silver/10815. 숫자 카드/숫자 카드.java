import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(br.readLine());
    int[] cards = new int[N];
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    for (int i = 0; i < N; i++) {
      cards[i] = Integer.parseInt(st.nextToken());
    }
    int M = Integer.parseInt(br.readLine());
    int[] sangs = new int[M];
    st = new StringTokenizer(br.readLine(), " ");
    for (int i = 0; i < M; i++) {
      sangs[i] = Integer.parseInt(st.nextToken());
    }
    // init
    Arrays.sort(cards);
    for (int i = 0; i < M; i++) {
      sb.append(findCards(cards, sangs[i], 0, N - 1)).append(" ");
    }
    System.out.println(sb.toString());
  } // end of class

  public static int findCards(int[] cards, int sang, int left, int right) {
    if (cards[right] < sang || cards[left] > sang) {
      return 0;
    }
    if (cards[right] == sang || cards[left] == sang) {
      return 1;
    }
    int mid = 0;
    while (left <= right) {
      mid = (left + right) / 2;
      if (cards[mid] <= sang) {
        if (cards[mid] == sang) {
          return 1;
        }
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return 0;
  }
}// end of main