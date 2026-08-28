class Solution {
    public int maxProduct(String[] words) {
        int max = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (!check(words[i], words[j])) {
                    max = Math.max(max, (words[i].length() * words[j].length()));
                }
            }
        }
        return max;
    }

    public static boolean check(String f, String s) {
        boolean[] present = new boolean[26];

        for (char ch : f.toCharArray()) {
            present[ch - 'a'] = true;
        }

        for (char ch : s.toCharArray()) {
            if (present[ch - 'a']) {
                return true;
            }
        }
        return false;
    }
}