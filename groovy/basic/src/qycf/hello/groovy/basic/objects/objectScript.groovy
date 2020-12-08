package qycf.hello.groovy.basic.objects

/**
 * 无论是直接使用.调用属性, 还是使用get/set 最终都是调用get/set
 *
 * */

def person = new Person(name: 'Bai', age: 26)
println " the name is ${person.name}, " + "the age is ${person.getAge()}"

/**
 * 方法异常处理测试用例
 * -> invokeMethod 方法重写
 * -> methodMissing 方法重写
 * */
def errorPerson = new Person(name: 'Sam', age: 19)
println errorPerson.cry()

/**
 * 为类动态地添加一个属性
 *
 * */
Person.metaClass.sex = 'male'
Person metaPerson = new Person(name: 'meta', age: 11)
println metaPerson.sex
metaPerson.sex = 'female'
println "the new sex is ${metaPerson.sex}"

// 为类动态添加方法
Person.metaClass.sexUpperCase = { -> sex.toUpperCase() }
def metaPerson2 = new Person(name: 'meta2', age: 13)
println metaPerson2.sexUpperCase()

// 为类动态添加静态方法
Person.metaClass.static.createPerson = {
    String name, int age -> new Person(name: name, age: age)
}
def person3 = Person.createPerson('renzhiqiang', 26)
println person3.name + " and " + person3.age

// 允许 动态添加的属性方法 全局添加
ExpandoMetaClass.enableGlobally()

