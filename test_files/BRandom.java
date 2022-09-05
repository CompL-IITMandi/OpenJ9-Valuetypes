public final class BRandom {
    private BPoint p;
    public int x;
    public String str;

    BRandom() {
       super();
    }

    BRandom(int x1, int y1, int x) {
        this.p = new BPoint(x1, y1);
        this.x = x;
        this.str = null;
    }

    public BPoint getP() {
        return p;
    }



}
