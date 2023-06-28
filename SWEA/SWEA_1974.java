package SWEA;
import java.io.*;
import java.util.*;
 
public class SWEA_1974 {
    public static Boolean chkRowCol(int[][] board) {
        HashSet<Integer> chkRow = new HashSet<>();
        HashSet<Integer> chkCol = new HashSet<>();
 
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (!chkRow.contains(board[i][j]))
                    chkRow.add(board[i][j]);
                else return false;
                if(!chkCol.contains(board[j][i]))
                    chkCol.add(board[j][i]);
                else return false;
            }
            chkRow.clear();
            chkCol.clear();
        }
        return true;
    }
    public static Boolean chkSquare(int[][] board){
        HashSet<Integer> chkList = new HashSet<>();
        for(int i = 0; i < 9; i += 3){
            for(int j = 0; j < 9; j += 3){
                for(int y = i; y < i+3; y++){
                    for(int x = j; x < j+3; x++){
                        if(!chkList.contains(board[y][x]))
                            chkList.add(board[y][x]);
                        else return false;
                    }
                }
                chkList.clear();
            }
        }
        return true;
    }
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int i, j, answer;
        int[][] board = new int[9][9];
        int T = Integer.parseInt(br.readLine());
 
        for(int tc = 1; tc <= T; tc++){
            for(i = 0; i < 9; i++){
                st = new StringTokenizer(br.readLine());
                for(j = 0; j < 9; j++){
                    board[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            answer = 0;
            if (chkRowCol(board) && chkSquare(board)) answer = 1;
            System.out.printf("#%d %d\n",tc,answer);
        }
    }
}