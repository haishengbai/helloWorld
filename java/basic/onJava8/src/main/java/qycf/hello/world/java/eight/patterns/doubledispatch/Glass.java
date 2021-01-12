// patterns/doubledispatch/Glass.java
// (c)2020 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Glass for double dispatching
package qycf.hello.world.java.eight.patterns.doubledispatch;
import java.util.*;

public class Glass extends qycf.hello.world.java.eight.patterns.trash.Glass
    implements TypedBinMember {
  public Glass(double wt) { super(wt); }
  @Override
  public boolean addToBin(List<TypedBin> tbins) {
    return tbins.stream()
      .anyMatch(tb -> tb.add(this));
  }
}
