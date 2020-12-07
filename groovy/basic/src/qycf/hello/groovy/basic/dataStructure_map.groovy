package qycf.hello.groovy.basic

def javaMap = new HashMap()

/**
* groovy map key默认使用不可变的单引号字符串
*
* */

// groovy
def colors = [red: 'ff00000',
                 green: '00ff00',
                 blue: '0000ff']

// 索引方式
println colors['red']
println colors.blue

// 添加
colors.yellow = 'fff00'
colors.leftShift([black: "000000"])
colors.complex = [a: 1, b: 2]
println colors

// class java.util.LinkedHashMap
println colors.getClass()

// 删除 使用remove
colors.remove('red')
println colors

// 操作
def students = [
        1 : [number: '0001', name: 'Bob', score: 55, sex: 'male'],
        2 : [number: '0002', name: 'Johnny', score: 62, sex: 'female'],
        3 : [number: '0003', name: 'Claire', score: 73, sex: 'female'],
        4 : [number: '0004', name: 'Amy', score: 66, sex: 'male']
]

// 遍历
students.each { def student -> println "the key is ${student.key}," + "the value is ${student.value}"}

// 带索引的遍历
students.eachWithIndex {
    def student, int index -> println "index is ${index}, the key is ${student.key}, " + "the value is ${student.value}"
}

// 直接遍历key-value
students.eachWithIndex{ key, value, int i -> println "index is ${i}, the key is ${key}, " + "the value is ${value}"}

// 查找
def entry = students.find { def student -> return student.value.score >= 60}
println entry

def entrys = students.findAll { def student -> return student.value.score >= 60}
println entrys

def count = students.count {def student -> return student.value.score >= 60 && student.value.sex == 'male'}
println count

def names = students.findAll { def student -> return student.value.score >= 60}.collect {
    return it.value.name
}
println names

// 分组
def group = students.groupBy { def student -> return student.value.score >= 60 ? '及格' : '不及格'}
println group

// 排序(和list不同, map排序会返回一个新的对象)
def sort = students.sort({a, b ->
    Number score1 = a.value.score
    Number score2 = b.value.score
    return  score1 == score2 ? 0 : score1 > score2 ? -1 : 1})
println sort

