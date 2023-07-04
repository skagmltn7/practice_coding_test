package BOJ;
import java.io.*;

public class BOJ_27328 {
    public static int compare(int a, int b) {
        if (a < b) return -1;
        else if (a == b) return 0;
        else return 1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        System.out.println(compare(a, b));
    }
}
