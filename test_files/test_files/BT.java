public class BT {

  public static void main(String args[]) {
    BT bt = new BT();
    bt.foo();
  }

  void foo() {
    BLine l1 = new BLine(0,0,0,0);
    System.out.println(l1.toString());
  }
}

//--No of value type objects created = 4.  { 2 intially using default values and 2 for withfield. }
//-- Is it possible to save withfield operations and intialize with values?
//--No of flattened fields = 4 { 1 line object -> 2 point objects -> 4 coordinate fields inlined into one line object}
//--No of inlined value type objects = 2. { 2 point objects. }