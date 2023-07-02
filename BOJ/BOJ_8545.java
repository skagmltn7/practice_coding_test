package BOJ;
import java.io.*;

public class BOJ_8545 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        for(int i=N.length()-1;i>=0;i--)
            System.out.printf("%s",N.charAt(i));

    }
}
