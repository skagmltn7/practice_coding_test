import java.io.*;
import java.util.*;

/**
 * 
 * 1. 아이디어 
 * 부분집합 
 * 합이 100인 애 찾기
 *
 */
public class BOJ_3040 {
	static int[] hatNum = new int[9];
	static Stack<Integer> dwarfs = new Stack<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 9; i++) {
			hatNum[i] = Integer.parseInt(br.readLine());
		}

		pickDwarf(0, 0);
	}
	
	public static void pickDwarf(int inx, int sum) {
		if (dwarfs.size() == 7) {
			if (sum == 100) {
				StringBuilder sb = new StringBuilder();
				for (int dwarf : dwarfs) {
					sb.append(dwarf).append("\n");
				}
				System.out.println(sb);
			}
			return;
		}
		if (inx == 9)
			return;
		dwarfs.push(hatNum[inx]);
		pickDwarf(inx + 1, sum + hatNum[inx]);
		dwarfs.pop();
		pickDwarf(inx + 1, sum);
	}
}
