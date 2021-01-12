// patterns/trashvisitor/Cardboard.java
// (c)2020 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Cardboard for the visitor pattern
package qycf.hello.world.java.eight.patterns.trashvisitor;

public class Cardboard extends qycf.hello.world.java.eight.patterns.trash.Cardboard
    implements Visitable {
  public Cardboard(double wt) { super(wt); }
  @Override
  public void accept(Visitor v) {
    v.visit(this);
  }
}
