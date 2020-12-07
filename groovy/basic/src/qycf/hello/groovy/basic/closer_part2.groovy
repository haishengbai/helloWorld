package qycf.hello.groovy.basic


int x = fab(5)
println x

// 求num 阶乘
int fab(int number) {
    int result = 1
    1.upto(number, {num -> result *= num})
    return result
}

int y = fab2(5)
println y

int fab2(int num) {
    int result = 1
    num.downto(1) {
        a -> result *= a
    }
    return result
}


// 累加
int z = cal(100)
println z

int cal(int num) {
    int result = 0
    num.times {
        c -> result += c
    }
    return result
}

/**
 * 通过查看源码来使用闭包
 *
 * */

