package BOJ;
import java.io.*;

public class BOJ_5543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int hamburger = Integer.MAX_VALUE;
        int beverage = Integer.MAX_VALUE;

        for (int i = 0; i < 3; i++)
            hamburger = Integer.min(hamburger, Integer.valueOf(br.readLine()));
        for (int i = 0; i < 2; i++)
            beverage = Integer.min(beverage, Integer.valueOf(br.readLine()));
        System.out.println(hamburger + beverage - 50);
    }
}
