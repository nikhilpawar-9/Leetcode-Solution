class Solution {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        Collections.sort(tasks, Collections.reverseOrder());
        Collections.sort(processorTime);
        int mid = tasks.size() / processorTime.size();
        int best = 0;
        for(int i = 0; i < processorTime.size(); i++){
            int max = Integer.MIN_VALUE;
            for(int j = mid * i; j < Math.min((i + 1) * mid , tasks.size()); j++){
                max = Math.max(max, processorTime.get(i) + tasks.get(j));
                best = Math.max(best, max);
            }
        }
        return best;
    }
}