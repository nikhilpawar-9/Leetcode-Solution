class Solution {
    public String reverseWords(String s) {
        String words[] = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String s1 : words){
            StringBuilder s2 = new StringBuilder(s1);
            s2.reverse();
            sb.append(s2 + " ");
        }
        return sb.toString().trim();
    }
}