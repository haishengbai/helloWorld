package qycf.hello.groovy.basic

import groovy.xml.MarkupBuilder

final String xml = ''''''

// 从开始解析xml , @接属性, .接标签
def xmlSluper = new XmlSlurper()
def response = xmlSluper.parseText(xml)

// 深度遍历 xml数据
response.depthFirst().findAll { book ->
    return book.author.text == "李刚"
}

// 广度遍历 xml数据
response.values.books.children().findAll {
    node -> node.name() == 'book' && node.@id == '2'
}.collect {
    node -> return node.title.text()
}

// 生成xml
def sw = new StringWriter()
def xmlBuilder = new MarkupBuilder(sw) // 用来生成xml数据的核心类
xmlBuilder.langs(type: 'current', count: '3', mainstream: 'true') {
    language(flavor: 'static', version: '1.5', value: 'java')
    language(flavor: 'dynamic', version: '1.5', value: 'groovy')
    language(flavor: 'dynamic', version: '1.5', value: 'javascript')
}

println sw

class Langs {
    String type = 'current'
    int count = 3
    boolean mainstream = true
    def language = [
            new Language(flavor: 'static', version: 1.5, value: 'java'),
            new Language(flavor: 'dynamic', version: 1.5, value: 'groovy'),
            new Language(flavor: 'dynamic', version: 1.5, value: 'javascript')
    ]
}

class Language {
    String flavor
    String version
    String value
}

