package qycf.hello.groovy.basic

// 定义list
def javaList = new ArrayList() // java
def groovyList = [1, 2, 3, 4, 5]
println groovyList.class
println groovyList.size()

// 定义数组
def array = [1, 2, 3, 4, 5] as int[]
int[] array2 = [1, 2, 3, 4, 5]

// 排序
def sortList = [6, -3, 9, 2, -7, 1, 5]
Comparator sortRule = { a, b -> a == b ? 0 : Math.abs(a) < Math.abs(b) ? -1 : 1}
Collections.sort(sortList, sortRule)
println sortList

sortList.sort({ a, b -> a == b ? 0 : Math.abs(a) < Math.abs(b) ? 1 : -1})
println sortList

def sortStringList = ['abc', 'z', 'Hello', 'groovy', 'java']
sortStringList.sort({ it -> return it.size()})
println sortStringList

// 查找 all, every, any, max, min
def findList = [-3, 9, 6, 2, -7, 1, -5]
int find1 = findList.find({ return it % 2 == 0})
def findAll = findList.findAll{return it % 2 != 0}
println findAll.toListString()
def findAny = findList.any({return it % 2 != 0})
println findAny.toString()
def findEvery = findList.every({return it % 2 == 0})
println findEvery
def findMax = findList.max()
println findMax
println findList.min({ return Math.abs(it)})

// 统计
println findList.count( { return it % 2 == 0 })

// 添加, 删除
def list = [1, 2, 3, 4, 5]
list.add(6)
list.leftShift(7)
list << 8
println list.toListString()
def plusList = list + 9
println plusList.toListString()

list.remove(7)
list.remove((Object) 7)
list.removeAt(7)
list.removeElement(6)
list.removeAll({ return it % 2 == 0 })
pirntln list - [6, 7]


