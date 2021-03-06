package qycf.hello.world.java.eight.interfaces;// interfaces/Machine.java
// (c)2020 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
import qycf.hello.world.java.eight.onjava.Operations;

import java.util.*;

class Bing implements Operations {
  public void execute() {
    Operations.show("Bing");
  }
}

class Crack implements Operations {
  public void execute() {
    Operations.show("Crack");
  }
}

class Twist implements Operations {
  public void execute() {
    Operations.show("Twist");
  }
}

public class Machine {
  public static void main(String[] args) {
    Operations.runOps(
      new Bing(), new Crack(), new Twist());
  }
}
/* Output:
Bing
Crack
Twist
*/
