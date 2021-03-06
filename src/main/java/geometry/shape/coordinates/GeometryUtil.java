package geometry.shape.coordinates;

import geometry.shape.coordinates.Point;

public class GeometryUtil {
    public static double getIntervalLength(Point start, Point end) {
        return Math.sqrt(Math.pow((end.getX() - start.getX()), 2) + Math.pow((end.getY() - start.getY()), 2));
    }
}
