package qycf.hello.world.java.eight.standardio;// standardio/Echo.java
// (c)2020 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// How to read from standard input
import qycf.hello.world.java.eight.onjava.TimedAbort;

import java.io.*;

public class Echo {
  public static void main(String[] args) {
    TimedAbort abort = new TimedAbort(2);
    new BufferedReader(
      new InputStreamReader(System.in))
      .lines()
      .peek(ln -> abort.restart())
      .forEach(System.out::println);
    // Ctrl-Z or two seconds inactivity
    // terminates the program
  }
}
