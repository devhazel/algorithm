class Solution {
    private static final int[] dx = {0, 1, -1};
    private static final int[] dy = {1, 0, -1};
    
    public int[] solution(int n) {
        int[][] matrix = new int[n][n];
        int x=0, y=0, d=0, num=0;
        while(true) {
            matrix[y][x] = ++num;
            int nx = x+dx[d], ny = y+dy[d];
            if(nx == n || ny == n || matrix[ny][nx] != 0) {
                d = (d+1)%3;
                nx = x+dx[d];
                ny = y+dy[d];
                if(nx == n || ny == n || matrix[ny][nx] != 0) {
                    break;
                }
            }
            x = nx;
            y = ny;
        }
        
        int[] result = new int[num];
        int idx = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++) {
                result[idx++] = matrix[i][j];
            }
        }
        return result;
    }
}
