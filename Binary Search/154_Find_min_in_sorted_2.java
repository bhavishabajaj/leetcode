class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int ans = Integer.MAX_VALUE;
        while(left<=right){
            int mid = left + (right - left)/2;
            if(nums[mid] == nums[left] && nums[mid] == nums[right]){
                ans = Math.min(nums[mid] , ans);
                left++;
                right--;
            }
            else if(nums[left] <= nums[mid]){
                ans = Math.min(ans , nums[left]);
                left = mid+1;
            }
            else{
                ans = Math.min(nums[mid] , ans);
                right = mid-1;
            }
        }
        return ans;
    }
}
