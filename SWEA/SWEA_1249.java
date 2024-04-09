import java.io.*;
import java.util.*;

public class Solution {

  static final int[] DY = {-1, 0, 1, 0};
  static final int[] DX = {0, 1, 0, -1};

  static class RecoverCar {

    int y;
    int x;
    int dist;

    public RecoverCar(int y, int x, int dist) {
      this.y = y;
      this.x = x;
      this.dist = dist;
    }
  }

  static PriorityQueue<RecoverCar> pq = new PriorityQueue<>(
      (c1, c2) -> Integer.compare(c1.dist, c2.dist)
  );
  static int[][] map, dist;
  static int N;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int C = Integer.parseInt(br.readLine());
    for (int tc = 1; tc <= C; tc++) {
      N = Integer.parseInt(br.readLine());
      map = new int[N + 2][N + 2];
      dist = new int[N + 2][N + 2];
      for (int i = 1; i <= N; i++) {
        char[] input = br.readLine().toCharArray();
        for (int j = 1, inx = 0; j <= N; j++, inx++) {
          map[i][j] = input[inx] - '0';
          dist[i][j] = Integer.MAX_VALUE;
        }
      }
      dijkstra();
      sb.append('#').append(tc).append(' ').append(dist[N][N]).append("\n");
      pq.clear();
    }
    System.out.println(sb);
  } // end of class

  private static void dijkstra() {
    pq.offer(new RecoverCar(1, 1, 0));
    dist[1][1] = 0;
    while (!pq.isEmpty()) {
      RecoverCar cur = pq.poll();
      if (dist[cur.y][cur.x] < cur.dist) {
        continue;
      }
      for (int i = 0; i < 4; i++) {
        int ny = cur.y + DY[i];
        int nx = cur.x + DX[i];
        if (!chkRange(ny, nx)) {
          continue;
        }
        int nxtDist = map[ny][nx] + cur.dist;
        if (dist[ny][nx] > nxtDist) {
          dist[ny][nx] = nxtDist;
          pq.offer(new RecoverCar(ny, nx, nxtDist));
        }
      }
    }
  }

  private static boolean chkRange(int ny, int nx) {
    return 1 <= ny && ny <= N && 1 <= nx && nx <= N;
  }
}// end of main
