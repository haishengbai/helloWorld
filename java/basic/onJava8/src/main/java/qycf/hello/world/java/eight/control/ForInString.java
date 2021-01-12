package qycf.hello.world.java.eight.control;// control/ForInString.java
// (c)2020 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

public class ForInString {
  public static void main(String[] args) {
    for(char c : "An African Swallow".toCharArray())
      System.out.print(c + " ");

    int i = 1;
    for ( ; i< 3 ;i++ ) {
      System.out.println("aa");
    }
  }
}
/* Output:
A n   A f r i c a n   S w a l l o w
*/
