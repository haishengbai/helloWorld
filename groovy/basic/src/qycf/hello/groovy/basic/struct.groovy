package qycf.hello.groovy.basic

// switch case 可以匹配任何类型

def x = 1.23
def result
switch (x) {
    case 'foo':
        result = 'found foo'
        break
    case 'bar':
        result = 'found bar'
        break
    case [4,5,6,'inlist']: //列表
        result = 'list'
        break
    case 12..30:
        result = 'range' //范围
        break
    case Integer:
        result = 'integer'
        break
    case BigDecimal:
        result = 'big decimal'
        break
    default: result = 'default'
}

println result

// for循环

// 对范围进行循环
def sum = 0
for (i in 0..9) {
    sum += i
}

println sum

// 对list循环
for(i in [1,2,3,4,5,6,7,8,9]) {
    sum += i
}

println(sum)

// 对map循环(不需要迭代器)

for (i in ['lili': 1, 'luck': 2, 'peter': 3]) {
    sum += i.value
}

println sum