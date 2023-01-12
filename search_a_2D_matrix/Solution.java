package search_a_2D_matrix;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] multi = new int[][]{
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
//        int[][] multi = new int[][]{
//                {1},
//                {3}
//        };
        System.out.println(solution.searchMatrix(multi, 61));
    }

public boolean searchMatrix(int[][] matrix, int target) {
    int n = matrix.length;
    int m = matrix[0].length;
    for(int i = 0 ; i < n ; i++){
        for(int j = 0 ; j < m ; j++){
            if(matrix[i][j] == target) {
                return true;
            }
        }
    }
    return false;
}
}
