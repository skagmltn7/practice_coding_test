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
    System.out.println(move());
  } // end of class

  public static String move() {
    ArrayDeque<Person> queue = new ArrayDeque<>();
    boolean[][][] visited = new boolean[N + 2][M + 2][2]; // 1: 칼있을때 0: 없을때
    queue.offer(new Person(1, 1, 0));
    visited[1][1][0] = true;
    while (!queue.isEmpty()) {
      Person cur = queue.poll();
      if (cur.time > T) {
        break;
      }
      if (cur.y == N && cur.x == M) {
        return "" + cur.time;
      }
      for (int i = 0; i < 4; i++) {
        int ny = cur.y + DY[i];
        int nx = cur.x + DX[i];
        if (visited[ny][nx][cur.hasGram] || !chkRange(ny, nx) || isWall(ny, nx, cur.hasGram)) {
          continue;
        }
        if (map[ny][nx] == 2) {
          visited[ny][nx][1] = true;
          queue.offer(new Person(ny, nx, cur.time + 1, 1));
          continue;
        }
        visited[ny][nx][cur.hasGram] = true;
        queue.offer(new Person(ny, nx, cur.time + 1, cur.hasGram));
      }
    }
    return "Fail";
  }

  public static boolean chkRange(int ny, int nx) {
    return 1 <= ny && ny <= N && 1 <= nx && nx <= M;
  }

  public static boolean isWall(int ny, int nx, int hasGram) {
    return map[ny][nx] == 1 && hasGram == 0;
  }
}// end of main