package qycf.hello.groovy.basic

/**
 * range 本质就是list
 * 操作方法完全与range一致
 *
 * */
def range = 1..10
println range[0]
println range.contains(10)
println range.from
println range.to
Range rg

/**
 * 遍历
 *
 * */
range.each {
    println it
}

for (i in range) {
    println i
}

/**
 *  switch-case
 *
 * */
def getGrade(Number number) {
    def result
    switch (number) {
        case 0..<60:
            result = '不及格'
            break
        case 60..<70:
            result = '及格'
            break
        case 70..100:
            result = '优秀'
            break
    }
}

def result = getGrade(70)
println result