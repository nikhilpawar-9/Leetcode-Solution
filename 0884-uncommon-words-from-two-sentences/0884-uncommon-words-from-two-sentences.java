class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        List<String> list = new ArrayList<>();
        String[] char1 = s1.split(" ");
        String[] char2 = s2.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for(String s : char1){
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for(String s : char2){
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for(String s : map.keySet()){
            if(map.get(s) == 1){
                list.add(s);
            }
        }
        return list.toArray(new String[0]);
    }
}