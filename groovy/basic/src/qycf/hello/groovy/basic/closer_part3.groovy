package qycf.hello.groovy.basic

/**
 *  闭包的三个重要变量
 *  this（无法修改）
 *  owner（无法修改）
 *  delegate（可以修改）
 **/

def scriptCloser = {
    // 代表闭包定义处的类
    println "scriptCloser this:" + this
    // 代表闭包定义处的类或者对象(闭包中的闭包)
    println "scriptCloser owner:" + owner
    // 代表任意对象,一般和owner等效(除非人为修改)
    println "scriptCloser delegate:" + delegate
}

scriptCloser.call()

// 定义了一个内部类
class Person{

    def classCloser = {
        println "classCloser this:" + this
        println "classCloser owner:" + owner
        println "classCloser delegate:" + delegate
    }

    def static say() {
        def classCloser = {
            println "methodClassCloser this:" + this
            println "methodClassCloser owner:" + owner
            println "methodClassCloser delegate:" + delegate
        }
        classCloser.call()
    }
}
Person person = new Person()
person.classCloser.call()
// 加了static, 值向的是字节码, 而不是对象的地址
person.say()

// 闭包中定义一个闭包
def nestCloser = {
    def innerCloser = {
        println "innerCloser this:" + this
        println "innerCloser owner:" + owner
        println "innerCloser delegate:" + delegate
    }
    innerCloser.call()
    innerCloser.delegate = person // 修改默认的 delegate
    innerCloser.call()
}

nestCloser.call()

/**
 * 闭包的委托策略
 *
 **/
class Student {
    String name
    def pretty = { "My name is ${name}" }

    String toString() {
        pretty.call()
    }
}

class Teacher {
    String name
}

def stu = new Student(name: 'Sara')
def tea = new Teacher(name: "Android")
println stu.toString()

// 修改委托策略
stu.pretty.delegate = tea
stu.pretty.resolveStrategy = Closure.DELEGATE_FIRST
println stu.toString()