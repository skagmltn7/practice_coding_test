package BOJ;
import java.io.*;

public class BOJ_15680 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        switch(input){
            case 0:
                System.out.println("YONSEI");
                break;
            default:
                System.out.println("Leading the Way to the Future");
        }
    }
}
