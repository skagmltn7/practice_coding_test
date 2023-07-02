package BOJ;
import java.io.*;

public class BOJ_24568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int regular = Integer.parseInt(br.readLine());
        int small = Integer.parseInt(br.readLine());
        int leftDonuts = regular * 8 + small * 3 - 28;

        if (leftDonuts <= 0) System.out.println(0);
        else System.out.println(leftDonuts);
    }
}
