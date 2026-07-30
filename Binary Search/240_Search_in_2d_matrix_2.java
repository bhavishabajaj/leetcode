class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int column = matrix[0].length;
        int left = 0;
        int right = column - 1;
        while(left < row && right>=0 ){
            if(matrix[left][right] == target){
                return true;
            }
            else if(matrix[left][right] > target){
                right --;
            }
            else{
                left++;
            }
        }
        return false;
    }
}