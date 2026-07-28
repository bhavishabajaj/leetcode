class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int mid = 0;
        int right = nums.length - 1;
        for(int i = 0 ; i<nums.length ; i++){
            if(nums[mid] == 2){
                int temp = nums[mid];
                nums[mid] = nums[right];
                nums[right] = temp;
                right --;
            }
            else if(nums[mid]== 0){
                int temp = nums[mid];
                nums[mid] = nums[start];
                nums[start] = temp;
                mid++;
                start++;
            }
            else{
                mid++;
            }
        }
    }
}