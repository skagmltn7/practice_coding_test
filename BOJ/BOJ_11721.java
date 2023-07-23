import java.io.*;

public class BOJ_11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        for (int i = 0; i < input.length(); i++) {
            if (i!=0 &&i % 10 == 0)
                System.out.println();
            System.out.print(input.charAt(i));
        }
    }
}