public class BT1 {

  public static void main(String args[]) {
    BT1 bt = new BT1();
    bt.foo();
  }

  void foo() {
    BLine l1 = new BLine();
    System.out.println(l1.toString());
    BPoint p1 = new BPoint(1,2);
    System.out.println(p1.toString());
    BPoint p2 = new BPoint(3,2);
    System.out.println(p2.toString());
  }
}

//--No of value type objects created = 6.  { 4 point objects for one line object and 2 other explicitely defined point objects. }
//--No of flattened fields = 4. { 1 line object -> 2 point objects -> 4 coordinate fields inlined into one line object.}
//--No of inlined value type objects = 2. { 2 point objects. }