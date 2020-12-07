package qycf.hello.groovy.basic

// 基本用法
def closer = { println 'Hello groovy!'}
closer.call()

// 传递参数, 多个参数用逗号相隔
def closer2 = { String name -> println "Hello ${name}"}
closer2("groovy2")

// 隐式参数
def closer3 = { println "Hello ${it}"}
closer3("groovy")

// 闭包返回值
def closer4 = { String name ->
    return "Hello ${name}"
}
def result = closer4('groovy')
println result
