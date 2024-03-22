import java.io.*;
import java.util.*;

public class Main {

  static final int[] DY = {-1, 0, 1, 0};
  static final int[] DX = {0, 1, 0, -1};

  static class Bomb {

    int r, c;

    public Bomb(int r, int c) {
      this.r = r;
      this.c = c;
    }
  }

  static char[][] boards;
  static int R, C, N;
  static ArrayDeque<Bomb> bombs;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    R = Integer.parseInt(st.nextToken());
    C = Integer.parseInt(st.nextToken());
    N = Integer.parseInt(st.nextToken());

    boards = new char[R + 2][C + 2];
    bombs = new ArrayDeque<>();
    for (int i = 1; i <= R; i++) {
      char[] input = br.readLine().toCharArray();
      for (int j = 1, inx = 0; j <= C; j++, inx++) {
        boards[i][j] = input[inx];
      }

    }
    for (int i = 2; i <= N; i++) {
      if (i % 2 == 0) {
        addBombs();
        installBombs();
      } else {
        explodeBombs();
      }
    }
    printBoard();


  } // end of class

  private static void explodeBombs() {
    while (!bombs.isEmpty()) {
      Bomb bomb = bombs.pollFirst();
      boards[bomb.r][bomb.c] = '.';
      for (int i = 0; i < 4; i++) {
        int nr = bomb.r + DY[i];
        int nc = bomb.c + DX[i];
        if (chkRange(nr, nc)) {
          boards[nr][nc] = '.';
        }
      }
    }
  }

  private static void installBombs() {
    for (int i = 1; i <= R; i++) {
      Arrays.fill(boards[i], 'O');
    }
  }

  private static void addBombs() {
    for (int i = 1; i <= R; i++) {
      for (int j = 1; j <= C; j++) {
        if (boards[i][j] == 'O') {
          bombs.addLast(new Bomb(i, j));
        }
      }
    }
  }

  private static void printBoard() {
    StringBuilder sb = new StringBuilder();
    for (int i = 1; i <= R; i++) {
      for (int j = 1; j <= C; j++) {
        sb.append(boards[i][j]);
      }
      sb.append("\n");
    }
    System.out.println(sb);
  }

  private static boolean chkRange(int nr, int nc) {
    return 1 <= nr && nr <= R && 1 <= nc && nc <= C;
  }
}// end of main