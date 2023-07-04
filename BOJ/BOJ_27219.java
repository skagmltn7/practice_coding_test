package BOJ;
import java.io.*;

public class BOJ_27219 {
    public static void repeat(char c, int n) {
        for(int i=0;i<n;i++)
            System.out.print(c);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char q = 'V';
        char r = 'I';
        int day = Integer.valueOf(br.readLine());
        repeat(q, day / 5);
        repeat(r, day % 5);
    }
}
