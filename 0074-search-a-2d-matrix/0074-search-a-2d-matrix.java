
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowidx = searchrow(matrix, target);

        if (rowidx != -1) {
            return binarysearchrow(matrix, rowidx, target);
        }

        return false;
    }

    private int searchrow(int[][] matrix, int target) {
        int low = 0;
        int high = matrix.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (matrix[mid][0] <= target &&
                target <= matrix[mid][matrix[0].length - 1]) {
                return mid;
            } 
            else if (matrix[mid][0] < target) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        return -1;
    }

    private boolean binarysearchrow(int[][] matrix, int rowidx, int target) {
        int low = 0;
        int high = matrix[rowidx].length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (matrix[rowidx][mid] == target) {
                return true;
            } 
            else if (matrix[rowidx][mid] < target) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        return false;
    }
}
