class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int bal = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                if(bal > 0){
                    sb.append("(");
                }
                bal++;
            }
            else{
                bal--;
                if(bal > 0){
                    sb.append(")");
                }
            }
        }
        return sb.toString();
    }
}