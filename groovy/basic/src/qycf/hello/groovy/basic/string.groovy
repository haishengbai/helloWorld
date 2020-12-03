package qycf.hello.groovy.basic

def singleName = 'a single \'a\' string'
println singleName.class

// 3引号字符串可以提供格式,不需要 + 号换行
def tripleName = '''\
line one
line two
line three
'''
println tripleName
println tripleName.class

// 双引号字符串是可扩展字符串,可以添加变量,即为 GString(class org.codehaus.groovy.runtime.GStringImpl), 最为常用
def doubleName = "this is a common string"
println doubleName.class
def name = "Android"
def sayHello = "Hello: ${name}"
println sayHello
println sayHello.class

// 可扩展做任何的表达式
def sum = "The sum of 2 and 3 equals ${2 + 3}"
println sum

//
def result = echo(sum)
println result

static String echo(String message) {
    return message
}

/**
 * 字符串的方法
 * StringGroovyMethods
 * DefaultGroovyMethods
 * java.lang.String
 *
 * */
def str = "groovy Hello"
// groovy Hello
println str.center(8)
// groovy Hello
println str.padLeft(8, 'a')

def str2 = 'Hello'
// 31
println str.compareTo(str2)
// 字符编码比较 true
println str > str2

// g
println str.getAt(0)
println str[0]
// gr
println str[0..1]
// groovy
println str.minus(str2)

// olleH yvoorg
println str.reverse()
// Groovy Hello
println str.capitalize()

println str.isNumber()
//println str.toInteger()


