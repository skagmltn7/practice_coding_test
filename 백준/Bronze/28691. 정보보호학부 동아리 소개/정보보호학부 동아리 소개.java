import java.io.*;
import java.util.*;

public class Main {

  static Map<String, String> clubs = new HashMap<String, String>() {{
    put("M", "MatKor");
    put("W", "WiCys");
    put("C", "CyKor");
    put("A", "AlKor");
    put("$", "$clear");
  }};


  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println(clubs.get(br.readLine()));
  } // end of class
}// end of main