class Solution {
    public int[] solution(String s) {
        StringBuilder str = new StringBuilder(s);
        StringBuilder tmp = new StringBuilder();
        int[] answer = new int[2];
        while(!(str.length()==1 && str.charAt(0)=='1')){
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='0'){
                    answer[1]++;
                    continue;
                }
                tmp.append('1');
            }
            int len = tmp.length();
            str.setLength(0);
            while(len!=0){
                str.append(len%2);
                len/=2;
            }
            answer[0]++;
            tmp.setLength(0);
        }
        return answer;
    }
}