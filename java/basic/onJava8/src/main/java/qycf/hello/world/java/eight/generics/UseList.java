package qycf.hello.world.java.eight.generics;// generics/UseList.java
// (c)2020 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// {WillNotCompile}
import java.util.*;

public class UseList<W, T> {
  void f1(List<T> v) {}
  void f2(List<W> v) {}
}
