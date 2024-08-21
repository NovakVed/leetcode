package neetCode.binarySearch.searchA2DMatrix;

/**
 * 74. Search a 2D Matrix
 * {@link} <a href="https://leetcode.com/problems/search-a-2d-matrix/">74.
 * Search a 2D Matrix</a>
 */
class SearchA2DMatrixMine {
    public void main(String[] args) {
        int[][] matrix = new int[][] { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        int target = 3;
        System.out.println(searchMatrix(matrix, target));
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix[0].length - 1, row = 0;
        while (row < matrix.length) {
            if (matrix[row][r] >= target) {
                int l = 0, m = 0;
                while (l <= r) {
                    m = l + (r - l) / 2;
                    if (matrix[row][m] == target) {
                        return true;
                    }

                    if (matrix[row][m] < target) l = m + 1;
                    else r = m - 1;
                }
                return false;
            }
            else row++;
        }

        return false;
    }
}
