// patterns/doubledispatch/Cardboard.java
// (c)2020 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Cardboard for double dispatching
package qycf.hello.world.java.eight.patterns.doubledispatch;
import java.util.*;

public class Cardboard extends qycf.hello.world.java.eight.patterns.trash.Cardboard
    implements TypedBinMember {
  public Cardboard(double wt) { super(wt); }
  @Override
  public boolean addToBin(List<TypedBin> tbins) {
    return tbins.stream()
      .anyMatch(tb -> tb.add(this));
  }
}
