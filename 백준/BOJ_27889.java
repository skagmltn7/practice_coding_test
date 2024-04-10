package BOJ;
import java.io.*;

public class BOJ_27889 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        switch (br.readLine()) {
            case "NLCS":
                System.out.println("North London Collegiate School");
                break;
            case "BHA":
                System.out.println("Branksome Hall Asia");
                break;
            case "KIS":
                System.out.println("Korea International School");
                break;
            default:
                System.out.println("St. Johnsbury Academy");
        }
    }
}
