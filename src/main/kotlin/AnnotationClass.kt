// Ограничиваем использование где
@Target(AnnotationTarget.FUNCTION)
// когда используется
@Retention(AnnotationRetention.RUNTIME)
annotation class TestA

//@TestA

class TestMain {
    @TestA
    fun testFunc() {
        println("Test run")
    }

    fun testFunc2() {

    }
}

fun main() {

    val test = TestMain()
    // Прошлись по методам класса, для каждого метода вытащили аннотации,
    // и по каждой аннотации прошлись: если аннотация является TestA,
    // то invoke функция, которая выполняет метод заданного объекта -
    // т.е. выполнили наш тест
    test::class.java.methods.forEach { metod ->
        metod.annotations.forEach {
            if(it is TestA) {
                metod.invoke(test)
            }
        }

    }
}