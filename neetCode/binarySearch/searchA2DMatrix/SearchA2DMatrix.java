package neetCode.binarySearch.searchA2DMatrix;

class SearchA2DMatrix {
    public void main(String[] args) {
        int[][] matrix = new int[][] { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        int target = 10;
        System.out.println(searchMatrix(matrix, target));
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int columnLength = matrix.length - 1;
        int rowLength = matrix[0].length - 1;

        int top = 0, bot = columnLength; // bottom of 2d matrix is last row, while top is the first row!
        while (top <= bot) {
            int middleRow = top + (bot - top) / 2;
            if (target > matrix[middleRow][rowLength])
                top = middleRow + 1;
            else if (target < matrix[middleRow][0])
                bot = middleRow - 1;
            else
                break;
        }

        if (!(top <= bot)) {
            return false;
        }

        int row = top + (bot - top) / 2;
        int l = 0, r = rowLength;
        while (l <= r) {
            int m = (l + r) / 2;
            if (target > matrix[row][m]) {
                l = m + 1;
            } else if (target < matrix[row][m]) {
                r = m - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
