package BOJ;
import java.io.*;

public class BOJ_4999 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String j = br.readLine();
        String doctor = br.readLine();
        if (j.length() >= doctor.length()) System.out.println("go");
        else System.out.println("no");
    }
}