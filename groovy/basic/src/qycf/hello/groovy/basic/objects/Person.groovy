package qycf.hello.groovy.basic.objects

/**
 * groovy 中类默认都是public
 *
 * */
class Person implements Action {

    String name

    Integer age

    def increaseAge(Integer years) {
        this.name += years
    }

    @Override
    void eat() {
        println 'eat'
    }

    @Override
    void drink() {
        println 'drink'
    }

    @Override
    void play() {
        println 'play'
    }

    def invokeMethod(String name, Object args) {
        return "the method is ${name}, the params is ${args}"
    }

    def methodMissing(String name, Object args) {
        return "the method ${name} is missing"
    }
}
