class Solution {
    //23BET10075
    public double findMaxAverage(int[] nums, int k) {
        double max_avg = 0;
        int n = nums.length;
        double curr_sum = 0;
        for(int i=0;i<k;i++) {
            curr_sum += nums[i];
        }
        max_avg = curr_sum/k;

        for(int i=1;i+k-1<n;i++) {
            curr_sum += (nums[i+k-1] - nums[i-1]);
            double curr_avg = curr_sum/k;
            if(curr_avg > max_avg) {
                max_avg = curr_avg;
            }
        }
        return max_avg;
    }
}