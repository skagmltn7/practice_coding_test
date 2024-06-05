import java.util.*;

class Solution {
    static final Map<String,Integer> NUMBER = 
        Map.of(
                "zero",0,
                "one",1,
                "two",2,
                "three",3,
                "four",4,
                "five",5,
                "six",6,
                "seven",7,
                "eight",8,
                "nine",9
        );
    public int solution(String s) {
        s = s.toLowerCase();
        StringBuilder ans = new StringBuilder();
        StringBuilder alphabet = new StringBuilder();
        for(char c: s.toCharArray()){
            if('a'<=c&&c<='z'){
                alphabet.append(c);
                if(NUMBER.containsKey(alphabet.toString())){
                    ans.append(NUMBER.get(alphabet.toString()));
                    alphabet.setLength(0);
                }
                continue;
            }
            ans.append(c);
        }
        return Integer.parseInt(ans.toString());
    }
}