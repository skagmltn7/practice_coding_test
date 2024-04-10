import java.io.*;
import java.util.Arrays;

public class BOJ_2750 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		int[] nums = new int[n];

		for (int i = 0; i < n; i++) {
			nums[i] = Integer.valueOf(br.readLine());
		}
		Arrays.sort(nums);

		for (int num : nums) {
			System.out.println(num);
		}
	}
}
