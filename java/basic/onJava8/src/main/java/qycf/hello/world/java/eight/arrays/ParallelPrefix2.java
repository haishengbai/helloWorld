package qycf.hello.world.java.eight.arrays;// arrays/ParallelPrefix2.java
// (c)2020 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
import qycf.hello.world.java.eight.onjava.Rand;

import java.util.*;

import static qycf.hello.world.java.eight.onjava.ArrayShow.show;

public class ParallelPrefix2 {
  public static void main(String[] args) {
    String[] strings = new Rand.String(1).array(8);
    show(strings);
    Arrays.parallelPrefix(strings, (a, b) -> a + b);
    show(strings);
  }
}
/* Output:
[b, t, p, e, n, p, c, c]
[b, bt, btp, btpe, btpen, btpenp, btpenpc, btpenpcc]
*/
