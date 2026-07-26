class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;
        for(int i = 0 ; i<weights.length ; i++){
            left = Math.max(left , weights[i]);
            right += weights[i];
        }
        int ans = 0;
        while(left<=right){
            int mid = left + (right-left)/2;
            int day = dayz(weights , mid);
            if(day <= days){
                ans = mid;
                right = mid - 1;
            }
            else{
                left = mid +1;
            }
        }
        return ans;
    }
    private int dayz(int[] weights , int mid){
        int current_load = 0;
        int days = 1;
        for(int i = 0 ; i<weights.length ; i++){
            if(current_load + weights[i] <= mid){
                current_load += weights[i];
            }
            else{
                days++;
                current_load = weights[i];
            }
        }
        return days;
    }
}