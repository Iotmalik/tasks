public class Range {
    public int start;
    public int end;

    public Range(int start, int end) {
        if (start >= end) {
            throw new IllegalArgumentException("end must be more than start");
        }
        this.start = start;
        this.end = end;
    }

    public static void main(String[] args) {
        Range rangeA = new Range(5, 10);
        Range rangeB = new Range(7, 15);
        Range rangeC = new Range(0, 4);
        Range rangeD = null;

        crossing(rangeA, rangeB);
        System.out.println(crossing(rangeA, rangeB));
        System.out.println(comb(rangeA, rangeB));
        System.out.println(add(rangeA, rangeB));
    }

    public static Range comb(Range a, Range b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Cannot be null!");
        }
        if (a.start < b.end && b.start < a.end) {
            int x = Math.min(a.start, b.start);
            int y = Math.max(a.end, b.end);
            return new Range(x, y);
        } else System.out.println("No intersection");
        return null;
    }

    public static Range crossing(Range a, Range b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Cannot be null!");
        }
        int x = Math.max(a.start, b.start);
        int y = Math.min(a.end, b.end);
        if (x < y) {
            System.out.println("Intersection: " + x + "..." + y);
            return new Range(x, y);
        } else System.out.println("No intersection");
        return null;
    }

    public static Range add(Range a, Range b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Cannot be null!");
        }
        return new Range((a.start + b.start), (a.end + b.end));
    }

    @Override
    public String toString() {
        return "Range(" + start + "..." + end + ')';
    }
}
//  Сложение:  [a,b] + [c,d] = [a + c, b + d]
//  Вычитание: [a,b] − [c,d] = [a − d, b − c]
//  Умножение: [a,b] × [c,d] = [min (ac, ad, bc, bd), max (ac, ad, bc, bd)]
//  Деление:   [a,b] / [c,d] = [min (a/c, a/d, b/c, b/d), max (a/c, a/d, b/c, b/d)]
