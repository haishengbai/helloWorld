package qycf.hello.groovy.basic

def file = new File('/file.log')
file.eachLine {
    line -> println line
}

def test = file.getText()
def result = file.readLines()

def reader = file.withReader {
    reader ->
        char[] buffer = new char[100]
        reader.read(buffer)
        return buffer
}

def saveObject(Object object, String path) {
    try {
        // 首先创建目标文件
        def desFile = new File(path)
        if (!desFile.exists()) {
            desFile.createNewFile()
        }
        desFile.withObjectOutputStream { out ->
            out.writeObject(object)
        }
    } catch (Exception exception) {

    }
    return object
}