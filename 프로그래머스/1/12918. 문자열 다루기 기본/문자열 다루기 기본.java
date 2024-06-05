class Solution {
    public boolean solution(String s) {
        s = s.toLowerCase();
        for(char c:s.toCharArray()){
            if('a'<=c && c<='z')return false;
        }
        return s.length()==4||s.length()==6;
    }
}