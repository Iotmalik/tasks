public class Triangle {
    public static void main(String[] args) {
        Triangle tr = new Triangle(new Point(0, 1), new Point(0, 4), new Point(3, 0));
        System.out.println(tr.area());
    }

    static class Point {
        private double x;
        private double y;

        public Point(final double x, final double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }
    }
//     S=√p(p−a)(p−b)(p−c) площадь треугольника
//     p = a + b + c / 2

    Point a;
    Point b;
    Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
//        d = √((x2-x1)²+(y2-y1)²)
        double st1 = Math.abs(Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + (Math.pow(b.getY() - a.getY(), 2))));
        double st2 = Math.abs(Math.sqrt(Math.pow(c.getX() - b.getX(), 2) + (Math.pow(c.getY() - b.getY(), 2))));
        double st3 = Math.abs(Math.sqrt(Math.pow(c.getX() - a.getX(), 2) + (Math.pow(c.getY() - a.getY(), 2))));
        double p = (st1 + st2 + st3) / 2;
        return Math.sqrt(p * (p - st1) * (p - st2) * (p - st3));
    }
//    проверка на существование
//        double ab = Math.abs(Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + (Math.pow(b.getY() - a.getY(), 2))));
//        double bc = Math.abs(Math.sqrt(Math.pow(c.getX() - b.getX(), 2) + (Math.pow(c.getY() - b.getY(), 2))));
//        double ac = Math.abs(Math.sqrt(Math.pow(c.getX() - a.getX(), 2) + (Math.pow(c.getY() - a.getY(), 2))));
//        if ((ab + bc <= ac) || (ab + ac <= bc) || (bc + ac <= ab)) {
//            throw new IllegalArgumentException("Exception because such a triangle would be degenerative");
//        }
//        if ((a.getX() == b.getX()) && (b.getX() == c.getX() && (a.getX() == c.getX())) ||
//                ((a.getY() == b.getY()) && (b.getY() == c.getY()) && (a.getY() == c.getY()))) {
//            throw new IllegalArgumentException("Exception because such a triangle would be degenerative");
//        }
}
