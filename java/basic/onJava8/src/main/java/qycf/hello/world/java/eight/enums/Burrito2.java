// enums/Burrito2.java
// (c)2020 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// {java enums.Burrito2}
package qycf.hello.world.java.eight.enums;
import static qycf.hello.world.java.eight.enums.SpicinessEnum.HOT;
import static qycf.hello.world.java.eight.enums.SpicinessEnum.MEDIUM;
import static qycf.hello.world.java.eight.enums.SpicinessEnum.NOT;

public class Burrito2 {
  SpicinessEnum degree;
  public Burrito2(SpicinessEnum degree) {
    this.degree = degree;
  }
  @Override
  public String toString() {
    return "Burrito is "+ degree;
  }
  public static void main(String[] args) {
    System.out.println(new Burrito2(NOT));
    System.out.println(new Burrito2(MEDIUM));
    System.out.println(new Burrito2(HOT));
  }
}
/* Output:
Burrito is NOT
Burrito is MEDIUM
Burrito is HOT
*/
