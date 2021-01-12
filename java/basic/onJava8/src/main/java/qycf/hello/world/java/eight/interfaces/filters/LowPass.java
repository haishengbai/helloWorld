// interfaces/filters/LowPass.java
// (c)2020 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
package qycf.hello.world.java.eight.interfaces.filters;

public class LowPass extends Filter {
  double cutoff;
  public LowPass(double cutoff) {
    this.cutoff = cutoff;
  }
  @Override
  public Waveform process(Waveform input) {
    return input; // Dummy processing
  }
}