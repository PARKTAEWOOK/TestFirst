package liveStudy.ShinsegaeTest;

import java.awt.geom.Area;

public class Segment
{
    private static float pi = 3.14159f;

    public static Areas areas(double r, double a) {
        throw new UnsupportedOperationException("Waiting to be implemented.");
//        float area_of_sector = pi * (r * r) * (a/360);
//
//        Areas returnAreas = new Areas(10,90);
//        returnAreas.inside = pi * (10 * ) * (a/360);
//        return returnAreas;

    }

    public static class Areas {
        public final double inside, outside;

        public Areas(double inside, double outside) {
            this.inside = inside;
            this.outside = outside;
        }
    }

    public static void main(String[] args) {
        Areas areas = Segment.areas(10, 90);
        System.out.println("Areas: " + areas.inside + ", " + areas.outside);
    }
}
