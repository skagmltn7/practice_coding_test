package BOJ;
import java.io.*;

public class BOJ_15727 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        int answer = L / 5;
        if (L % 5 != 0) answer += 1;
        System.out.println(answer);
    }
}
