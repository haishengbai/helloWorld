package qycf.hello.groovy.basic


/**
 * 1.类型自动拆装箱
 * */
int x = 10
println x.class
// class java.lang.Integer
double y = 3.14
println y.class
// java.lang.Double

/**
 * 2.强弱类型自动转换
 * */
def x_1 = 11
println x_1.class
def y_1 = 3.1415
println y_1.class
def name = "Android"
println name.class


/**
 * 总结
 * 自己使用建议使用弱类型，需要外界调用建议强类型
 * def 定义的属性类型重新赋值可能会改变（动态类型）
 * */


