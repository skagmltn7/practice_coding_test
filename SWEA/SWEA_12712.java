package SWEA;
import java.io.*;
import java.util.*;
 
public class SWEA_12712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n, m;
        int plus, x, answer;
        int i, j;
        int[][] board;
 
        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            board = new int[n][n];
 
            for (i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (j = 0; j < n; j++) {
                    board[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            answer = Integer.MIN_VALUE;
 
            for (i = 0; i < n; i++) {
                for (j = 0; j < n; j++) {
                    plus = 0;
                    x = 0;
                    for(int gap = 1; gap < m; gap++){
                        if(i + gap < n) {
                            plus += board[i+gap][j]; // 플러스 위쪽
                            if(j + gap < n) x += board[i+gap][j+gap]; //엑스 남동쪽
                            if(j - gap >= 0) x += board[i+gap][j-gap]; // 엑스 남서쪽
                        }
                        if(i - gap >= 0) {
                            plus += board[i-gap][j]; // 플러스 아래쪽
                            if(j + gap < n) x += board[i-gap][j+gap]; //엑스 북동쪽
                            if(j - gap >= 0) x += board[i-gap][j-gap]; // 엑스 북서쪽
                        }
                        if(j + gap < n) {
                            plus +=board[i][j+gap]; // 플러스 오른쪽
                        }
                        if(j - gap >= 0) {
                            plus += board[i][j-gap]; // 플러스 왼쪽
                        }
                    }
                    plus += board[i][j];
                    x += board[i][j];
                    answer = Integer.max(answer,Integer.max(plus,x));
                }
            }
            System.out.printf("#%d %d\n",tc,answer);
        }
    }
}