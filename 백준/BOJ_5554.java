package BOJ;
import java.io.*;

public class BOJ_5554 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalSec = 0;
        for (int i = 0; i < 4; i++) {
            totalSec += Integer.valueOf(br.readLine());
        }
        System.out.println(totalSec / 60);
        System.out.println(totalSec % 60);
    }
}
