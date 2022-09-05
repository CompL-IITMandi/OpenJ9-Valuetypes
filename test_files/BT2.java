public class BT2 {

  public static void main(String args[]) {
    BT2 bt = new BT2();
    bt.foo();
  }

  void foo() {
    BLine l1 = new BLine();
    System.out.println(l1.getP1().getX());
    System.out.println(l1.getP1().getY());
    BLine l2 = new BLine();
    System.out.println(l1.getP2().getX());
    BPoint p1 = new BPoint(1,2);
    System.out.println(p1.toString());
    BPoint p2 = new BPoint(3,2);
    System.out.println(p2.getX());
  }
}
//--No of inlined field accesses = 3. {2 fields of l1 and one of l2.}
//--No of value type objects created = 10.  { (4 point objects for one line object)x2 and 2 other explicitely defined point objects. }
//--No of flattened fields = 8. { 1 line object -> 2 point objects -> 4 coordinate fields inlined into one line object.}
//--No of inlined value type objects = 4. { 2 point objects. }