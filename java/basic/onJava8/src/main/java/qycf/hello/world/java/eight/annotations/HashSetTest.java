// annotations/HashSetTest.java
// (c)2020 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// {java onjava.atunit.AtUnit
// build/classes/java/main/annotations/HashSetTest.class}
package qycf.hello.world.java.eight.annotations;
import qycf.hello.world.java.eight.onjava.atunit.Test;

import java.util.*;

public class HashSetTest {
  HashSet<String> testObject = new HashSet<>();
  @Test
  void initialization() {
    assert testObject.isEmpty();
  }
  @Test
  void tContains() {
    testObject.add("one");
    assert testObject.contains("one");
  }
  @Test
  void tRemove() {
    testObject.add("one");
    testObject.remove("one");
    assert testObject.isEmpty();
  }
}
/* Output:
annotations.HashSetTest
  . initialization
  . tRemove
  . tContains
OK (3 tests)
*/
