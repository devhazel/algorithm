import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(int[][] line) {
        List<Point> intersections = getIntersections(line);
        Point min = getMin(intersections);
        Point max = getMax(intersections);
        return getStringArray(intersections, min, max);
    }
    
    // 정수인 교점 구하기
    public List<Point> getIntersections(int[][] line) {
        List<Point> intersections = new ArrayList<>();
        for(int i=0; i<line.length-1; i++) {
            for(int j=i+1; j<line.length; j++) {
                if(line[i][0]*line[j][1] - line[i][1]*line[j][0] == 0) {
                    continue;
                }
                double denominator = (long)line[i][0]*(long)line[j][1] - (long)line[i][1]*(long)line[j][0] * 1.0;
                double x = ((long)line[i][1]*(long)line[j][2] - (long)line[i][2]*(long)line[j][1]) / denominator;
                double y = ((long)line[i][2]*(long)line[j][0] - (long)line[i][0]*(long)line[j][2]) / denominator;
                if(x%1==0 && y%1==0) {
                    intersections.add(new Point((long) x, (long) y));
                }
            }
        }
        return intersections;
    }
    
    // 사분면 범주 구하기
    public Point getMin(List<Point> list) {
        long minX = Long.MAX_VALUE;
        long minY = Long.MAX_VALUE;
        for(Point point : list) {
            if(point.getX() < minX) {
                minX = point.getX();
            }
            if(point.getY() < minY) {
                minY = point.getY();
            }
        }
        return new Point(minX, minY);
        
    }
    
    public Point getMax(List<Point> list) {
        long maxX = Long.MIN_VALUE;
        long maxY = Long.MIN_VALUE;
        for(Point point : list) {
            if(point.getX() > maxX) {
                maxX = point.getX();
            }
            if(point.getY() > maxY) {
                maxY = point.getY();
            }
        }
        return new Point(maxX, maxY);
    }
    
    // 문자열 배열로 출력
    public String[] getStringArray(List<Point> intersections, Point min, Point max) {
        String[] arr = new String[(int)max.getY()-(int)min.getY()+1];
        int idx = 0;
        for(long i=max.getY(); i>= min.getY(); i--) {
            StringBuilder sb = new StringBuilder();
            for(long j=min.getX(); j<=max.getX(); j++) {
                if(intersections.contains(new Point(j, i))) {
                    sb.append("*");
                } else {
                    sb.append(".");
                }
            }
            arr[idx++] = sb.toString();
        }
        return arr;
    }
}

class Point {
    private long x;
    private long y;
    
    public Point(long x, long y) {
        this.x = x;
        this.y = y;
    }
    
    public long getX() {
        return this.x;
    }
    public long getY() {
        return this.y;
    }
    @Override
    public boolean equals(Object o) {
        Point that = (Point) o;
        return this.x==that.x && this.y==that.y;
    }
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}