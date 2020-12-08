package qycf.hello.groovy.basic

import groovy.json.JsonOutput
import groovy.json.JsonSlurper

def list = [new qycf.hello.groovy.basic.objects.Person(name: 'John', age: 25),
            new qycf.hello.groovy.basic.objects.Person(name: 'Major', age: 26)]
println JsonOutput.toJson(list)
println JsonOutput.prettyPrint(JsonOutput.toJson(list))

// 解析不需要定义实体
def jsonSlurper = new JsonSlurper();
jsonSlurper.parse()

/**
 * net
 *
 * */
def getNetworkData(String url) {
    // 发送http请求
    def connection = new URL(url).openConnection()
    connection.setRequestMethod('GET')
    connection.connect()
    def response = connection.content.text

    // 将json转化为实体对象
    def jsonSluper = new JsonSlurper()
    return jsonSluper.parseText(response)
}

def response = getNetworkData('http://yuexibo.top/yxbApp/course_detail.json')
println response.data.head.name