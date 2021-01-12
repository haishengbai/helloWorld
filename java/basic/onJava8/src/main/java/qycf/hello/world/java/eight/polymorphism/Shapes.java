package qycf.hello.world.java.eight.polymorphism;// polymorphism/Shapes.java
// (c)2020 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Polymorphism in Java

import qycf.hello.world.java.eight.polymorphism.shape.RandomShapes;
import qycf.hello.world.java.eight.polymorphism.shape.Shape;

public class Shapes {
  public static void main(String[] args) {
    RandomShapes gen = new RandomShapes();
    // Make polymorphic method calls:
    for(Shape shape : gen.array(9))
      shape.draw();
  }
}
/* Output:
Triangle.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Circle.draw()
*/