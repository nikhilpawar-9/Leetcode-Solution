class Solution {
    public int maxProduct(int n) {
        List<Integer> list = new ArrayList<>();
        while(n > 0){
            int last = n % 10;
            list.add(last);
            n /= 10;
        }
        int max = 0;
        for(int i = 0; i < list.size(); i++){
            for(int j = i + 1; j < list.size(); j++){
                int p = list.get(i) * list.get(j);
                max = Math.max(p , max);
            }
        }
        return max;
    }
}