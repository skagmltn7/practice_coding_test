package BOJ;
import java.io.*;

public class BOJ_26574 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int input;
        for (int i = 0; i < n; i++) {
            input = Integer.parseInt(br.readLine());
            System.out.printf("%d %d\n", input, input);

        }
    }
}
