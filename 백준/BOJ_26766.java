package BOJ;
import java.io.*;

public class BOJ_26766 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] str = {
                " @@@   @@@ \n",
                "@   @ @   @\n",
                "@    @    @\n",
                "@         @\n",
                " @       @ \n",
                "  @     @  \n",
                "   @   @   \n",
                "    @ @    \n",
                "     @     \n",
        };
        for (int i = 0; i < n; i++) {
            for (String s : str) System.out.print(s);
        }
    }
}
