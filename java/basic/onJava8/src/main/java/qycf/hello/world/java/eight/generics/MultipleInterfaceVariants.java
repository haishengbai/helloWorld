// generics/MultipleInterfaceVariants.java
// (c)2020 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// {WillNotCompile}
package qycf.hello.world.java.eight.generics;

interface Payable<T> {}

class Employee2 implements Payable<Employee2> {}

class Hourly
implements Payable<Hourly> {}
