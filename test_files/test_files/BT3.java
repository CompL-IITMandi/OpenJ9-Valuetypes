public class BT3 {

  public static void main(String args[]) {
    System.out.println(args.length);
    if(args.length>0){
        System.out.println(args[0]);
    }
    BT3 bt = new BT3();
    bt.foo(args.length);
  }

  void foo(int count) {
    if(count>0){
        BRandom br = new BRandom();
        int num = br.getP().getX();
        int num2 = num + br.x;
        System.out.println(num2);
    }else{
        BRandom br1 = new BRandom();
        BRandom br2 = new BRandom(5,6,4);
        int num = br1.getP().getX();
        int num2 = num + br2.x;
        System.out.println(num2);
    }
  }
}
//--No of inlined field accesses = 3. {2 fields of l1 and one of l2.}
//--No of value type objects created = 10.  { (4 point objects for one line object)x2 and 2 other explicitely defined point objects. }
//--No of flattened fields = 8. { 1 line object -> 2 point objects -> 4 coordinate fields inlined into one line object.}
//--No of inlined value type objects = 4. { 2 point objects. }