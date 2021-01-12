// annotations/Testable.java
// (c)2020 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
package qycf.hello.world.java.eight.annotations;

import qycf.hello.world.java.eight.onjava.atunit.Test;

public class Testable {
  public void execute() {
    System.out.println("Executing..");
  }
  @Test
  void testExecute() { execute(); }
}
