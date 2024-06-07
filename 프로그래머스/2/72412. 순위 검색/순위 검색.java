import java.util.*;

class Solution {
    static Map<String,List<Integer>> people = new HashMap<>();
    static int[] ans;
    public int[] solution(String[] info, String[] query) {
        // 문자열 분리하기
        for(int i=0;i<info.length;i++){
            StringTokenizer st = new StringTokenizer(info[i]," ");
            String[] condition = new String[5];
            for(int j=0;j<5;j++){
                condition[j] = st.nextToken();
            }
            makeSentence("", 0, condition);
        }
        
        for(String str:people.keySet()){
            Collections.sort(people.get(str));
        }
        // System.out.println(people);
        ans = new int[query.length];
        
        for(int i = 0; i< query.length; i++){
            query[i] = query[i].replaceAll("and ","");
            // System.out.println("query: "+query[i]);
            StringTokenizer st = new StringTokenizer(query[i]," ");
            StringBuilder q = new StringBuilder();
            for(int j=0;j<4;j++){
                q.append(st.nextToken());
            }
            int score = Integer.parseInt(st.nextToken());
            ans[i] = binarySearch(q.toString(), score);
        }
        return ans;
    } // end of main
    
    public void makeSentence(String str, int cnt, String[] condition){
        if(cnt==4){
            int score = Integer.parseInt(condition[4]);
            if(people.containsKey(str)){
                people.get(str).add(score);
            }else{
                List<Integer> scores = new ArrayList<>();
                scores.add(score);
                people.put(str, scores);
            }
            return;
        }
        makeSentence(str+condition[cnt], cnt+1, condition);
        makeSentence(str+"-", cnt+1, condition);
    }
    
    public int binarySearch(String query, int score){
        if(!people.containsKey(query))return 0;
        List<Integer> scores = people.get(query);
        
        int left = 0;
        int right = scores.size();
        
        while(left<right){
            int mid = (left+right)/2;
            if(scores.get(mid) < score){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return scores.size()-left;
    }
    
} // end of class