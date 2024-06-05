import java.util.*;

class Solution {
    Set<Character> operations;
    List<Character> opers = new ArrayList<>();
    List<Long> nums = new ArrayList<>();
    Set<Character> visited = new HashSet<>();
    long ans = Long.MIN_VALUE;
    
    public long solution(String expression) {
        seperateExpression(expression);
        operations = new HashSet<>(opers);
        combi(0,new char[operations.size()]);
        return ans;
    } // end of main
    
    public void seperateExpression(String expression){
        StringBuilder num = new StringBuilder();
        for(char c:expression.toCharArray()){
            if(Character.isDigit(c)){
                num.append(c);
            }else{
                opers.add(c);
                nums.add(Long.parseLong(num.toString()));
                num.setLength(0);
            }
        }
        nums.add(Long.parseLong(num.toString()));
    } // end of seperateExpression
    
    public void combi(int cnt, char[] res){
        if(cnt==operations.size()){
            // System.out.println(res);
            calculate(res);
            return;
        }
        for(char oper:operations){
            if(!visited.contains(oper)){
                visited.add(oper);
                res[cnt] = oper;
                combi(cnt+1,res);
                visited.remove(oper);
            }
        }
    } // end of combi
    
    public void calculate(char[] res){
        List<Character> op = new ArrayList<>(opers);
        List<Long> num = new ArrayList<>(nums);
        
        for(int i=0;i<res.length;i++){
            for(int j=0;j<op.size();j++){
                if(res[i]!=op.get(j)) continue;
                long n = calOperate(num.get(j),num.get(j+1),res[i]);
                num.remove(j+1);
                num.remove(j);
                num.add(j,n);

                op.remove(j--);
            }
        }
        ans = Math.max(ans,Math.abs(num.get(0)));
    } // end of calculate
    
    public long calOperate(long n1, long n2, char oper){
        switch (oper){
            case '+': return n1+n2;
            case '-': return n1-n2;
            case '*': return n1*n2;
        }
        return 0L;
    } // end of calOperate
    
} // end of class