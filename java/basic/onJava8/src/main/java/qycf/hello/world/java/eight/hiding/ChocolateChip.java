package qycf.hello.world.java.eight.hiding;// hiding/ChocolateChip.java
// (c)2020 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Can't use package-access member from another package

import qycf.hello.world.java.eight.hiding.cookie2.Cookie;

public class ChocolateChip extends Cookie {
  public ChocolateChip() {
    System.out.println("ChocolateChip constructor");
  }
  public void chomp() {
    //- bite(); // Can't access bite
  }
  public static void main(String[] args) {
    ChocolateChip x = new ChocolateChip();
    x.chomp();
  }
}
/* Output:
Cookie constructor
ChocolateChip constructor
*/
