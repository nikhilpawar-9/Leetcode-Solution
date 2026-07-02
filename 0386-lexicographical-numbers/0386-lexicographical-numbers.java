class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= 9; i++){
            create(i, n, list);
        }
        return list;
    }
    
    public static void create(int num, int n, List<Integer> list){
        if(num > n) return;

        list.add(num);
        num *= 10;

        for(int i = 0; i <= 9; i++){
            create(num + i, n, list);
        }
    }
}