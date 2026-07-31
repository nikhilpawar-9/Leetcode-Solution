class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) freq[c - 'a']++;
        int a = 8;
        int sum = 0;
        Arrays.sort(freq);
        for (int i = 25; i > -1; i--) {
            sum += (freq[i] * (a / 8));
            a++;
            if (freq[i] == 0){
                break;
            } 
        }
        return sum;
    }
}