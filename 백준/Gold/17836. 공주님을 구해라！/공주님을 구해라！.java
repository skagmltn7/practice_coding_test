import java.io.*;
import java.util.*;

public class Main {

  static final int[] DY = {-1, 0, 1, 0};
  static final int[] DX = {0, 1, 0, -1};

  static class Person {

    int y;
    int x;
    int time;
    int hasGram;

    public Person(int y, int x, int time) {
      this.y = y;
      this.x = x;
      this.time = time;
    }

    public Person(int y, int x, int time, int hasGram) {
      this.y = y;
      this.x = x;
      this.time = time;
      this.hasGram = hasGram;
    }
  }

  static int[][] map;
  static int N, M, T;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    T = Integer.parseInt(st.nextToken());
    map = new int[N + 2][M + 2];
    for (int i = 1; i <= N; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      for (int j = 1; j <= M; j++) {
        map[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    int ans = move();
    System.out.println(ans == Integer.MAX_VALUE ? "Fail" : ans);
  } // end of class

  public static int move() {
    PriorityQueue<Person> pq = new PriorityQueue<>(
        (p1, p2) -> (Integer.compare(p1.time, p2.time)));
    boolean[][][] visited = new boolean[N + 2][M + 2][2]; // 1: 칼있을때 0: 없을때
    int ans = Integer.MAX_VALUE;
    pq.offer(new Person(1, 1, 0));
    visited[1][1][0] = true;
    while (!pq.isEmpty()) {
      Person cur = pq.poll();
      if (cur.time > T) {
        continue;
      }
      if (cur.y == N && cur.x == M) {
        ans = Math.min(ans, cur.time);
        continue;
      }
      for (int i = 0; i < 4; i++) {
        int ny = cur.y + DY[i];
        int nx = cur.x + DX[i];
        if (visited[ny][nx][cur.hasGram] || !chkRange(ny, nx) || isWall(ny, nx, cur.hasGram)) {
          continue;
        }
        if (map[ny][nx] == 2) {
          visited[ny][nx][1] = true;
          pq.offer(new Person(ny, nx, cur.time + 1, 1));
        }
        visited[ny][nx][cur.hasGram] = true;
        pq.offer(new Person(ny, nx, cur.time + 1, cur.hasGram));
      }
    }
    return ans;
  }

  public static boolean chkRange(int ny, int nx) {
    return 1 <= ny && ny <= N && 1 <= nx && nx <= M;
  }

  public static boolean isWall(int ny, int nx, int hasGram) {
    return map[ny][nx] == 1 && hasGram == 0;
  }
}// end of main