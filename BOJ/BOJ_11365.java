package BOJ;
import java.io.*;

public class BOJ_11365 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String cur = br.readLine();
            if (cur.equals("END")) break;
            for (int i = cur.length() - 1; i >= 0; i--) {
                System.out.printf("%c", cur.charAt(i));
            }
            System.out.println();
        }
    }
}
