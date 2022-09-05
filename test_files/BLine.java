public final class BLine {
    private BPoint p1;
    private BPoint p2;

    BLine() {
        this.p1 = new BPoint(0,0);
        this.p2 = new BPoint(0,0);
    }

    BLine(int x1, int y1, int x2, int y2) {
        this.p1 = new BPoint(x1, y1);
        this.p2 = new BPoint(x2, y2);
    }

    public BPoint getP1() {
        return p1;
    }

    public BPoint getP2() {
        return p2;
    }
}
