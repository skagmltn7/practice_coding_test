package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_26082 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] input = new int[3];
        for (int i = 0; i < 3; i++) input[i] = Integer.parseInt(st.nextToken());
        System.out.println(3 * input[2] * input[1] / input[0]);
    }
}
