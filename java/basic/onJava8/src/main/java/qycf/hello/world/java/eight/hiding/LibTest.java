package qycf.hello.world.java.eight.hiding;// hiding/LibTest.java
// (c)2020 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Uses the library
import qycf.hello.world.java.eight.com.mindviewinc.simple.List;
import qycf.hello.world.java.eight.com.mindviewinc.simple.Vector;

public class LibTest {
  public static void main(String[] args) {
    Vector v = new Vector();
    List l = new List();
  }
}
/* Output:
com.mindviewinc.simple.Vector
com.mindviewinc.simple.List
*/
