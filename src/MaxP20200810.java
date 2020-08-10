import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author Tongpengfei
 * @date 2020/8/10 8:05 下午
 */

class Point{
    int x;
    int y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }
}
public class MaxP20200810 {
    public static void main (String[] str) {
        Point p1 = new Point(1,2);
        Point p2 = new Point(5,3);
        Point p3 = new Point(4,6);
        Point p4 = new Point(7,5);
        Point p5 = new Point(9,0);
        ArrayList<Point> points = new ArrayList<>();
        points.add(p1);
        points.add(p2);
        points.add(p3);
        points.add(p4);
        points.add(p5);
//        points.sort(Comparator.comparingInt(Point::getY).reversed());
        points.sort((Point ph, Point pg)-> Integer.compare(pg.y, ph.y));
        int max_x = Integer.MIN_VALUE;
        for(Point point:points) {
            if(point.x>max_x) {
                max_x = point.x;
                System.out.println(String.format("(%d,%d) is the max point", point.x,point.y));
            }
        }
    }
}
