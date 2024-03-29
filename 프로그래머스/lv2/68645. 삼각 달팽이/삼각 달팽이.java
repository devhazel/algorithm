class Solution {
    public int[] solution(int n) {
        int[][] matrix = new int[n][n];
        int x = -1;
        int y = 0;
        int num = 1;
        for (int i = 0; i<n; i++) {
            if (i % 3 == 0) {
                // 행만 증가
                for (int j = 0; j < n-i; j++) { 
                    matrix[++x][y] = num++;
                }
            } else if (i % 3 == 1) {
                // 열만 증가
                for (int j = 0; j < n-i; j++) {
                    matrix[x][++y] = num++;
                }
            } else {
                // 행/열 감소
                for (int j = 0; j < n-i; j++) {
                    matrix[--x][--y] = num++;
                }
            }
        }
        int[] result = new int[(n * (n + 1)) / 2];
        int idx = 0;
        // 전체 배열 순회
//        for (int[] cols : matrix) {
//            for (int val : cols) {
//                if (val != 0) {
//                    result[idx++] = val;
//                }
//            }
//        }
        // 필요한 부분만 순회
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<=i; j++) {
                result[idx++] = matrix[i][j];
            }
        }
        return result;
    }
}