class Solution {
    // 상 우 좌 하 순서
    private static final int[] dr = {-1, 0, 0, 1};
    private static final int[] dc = {0, 1, -1, 0};


    public int[] solution(String[][] places) {
        int[] answer = new int[5];
        for(int i=0; i<places.length; i++) {
            String[][] room = getMatrix(places[i]);
            answer[i] = checkDistance(room) ? 1 : 0;
        }
        return answer;
    }
    
    private boolean checkDistance(String[][] room) {
        // 대기실 하나 단위
        for(int r=2; r<7; r++) {
            for(int c=2; c<7; c++) {
                if (!"P".equals(room[r][c])) {
                    continue;
                }
                // 좌석 별로 거리두기 안지킨 경우 하나라도 찾으면 false 반환
                if(!checkDistance(room, r, c)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean checkDistance(String[][] room, int orgRow, int orgCol) {
        // 좌석 하나 단위 >> 그 중 P 인 경우
        for(int d=0; d<4; d++) {
            int r = orgRow + dr[d%4];
            int c = orgCol + dc[d%4];
            // d=0; 상
            if("O".equals(room[r][c])) {
                if (hasAnotherPerson(room, r, c, 3-d)) {
                    return false;
                }
            } else if("P".equals(room[r][c])) {
                return false;
            }
        }
        return true;
    }

    private boolean hasAnotherPerson(String[][] room, int orgRow, int orgCol, int exclude) {
        for(int d=0; d<4; d++) {
            if(d==exclude) continue;
            int r = orgRow + dr[d];
            int c = orgCol + dc[d];
            // d=0; 상
            if("P".equals(room[r][c])) {
                return true;
            }
        }
        return false;
    }

    private String[][] getMatrix(String[] place) {
        String[][] room = new String[9][9];
        for(int i=2; i<7; i++) {
            for(int j=2; j<7; j++) {
                room[i][j] = String.valueOf(place[i-2].charAt(j-2));
            }
        }
        return room;
    }
}