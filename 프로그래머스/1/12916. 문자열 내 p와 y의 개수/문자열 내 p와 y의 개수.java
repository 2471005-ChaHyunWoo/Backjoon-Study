class Solution {
    boolean solution(String s) {
        boolean answer = true;

        s=s.toLowerCase();
        int p=0;
        int y=0;
        for(int i=0;i<s.length();i++){
            if('p'==s.charAt(i)){
                p++;
            }
            if('y'==s.charAt(i)){
                y++;
            }
        }
        
        if(p!=y){
            answer=false;
        }
        return answer;
    }
}