data class StudentV(
    val name: String,
    var age: Int = 19,
    val course: Int,
    val id: Id
) {

companion object {
    // Количество студентов
    var counter: Int = 0
    }
    init {
        counter++
    }
}

@JvmInline
value class Id(val id:Long) {
    init {

    }
}
// abstract по умолчанию open
abstract class SchoolerV {
    // переопределять необязательно
    fun read() {

    }
    // переопределять обязательно
    abstract fun write()
}
// В Kotlin и Java наследование только от одного класса, но много:
interface LearnV {

    fun study() {
        // Здесь можно задать тело по умолчанию, тогда override - не обязательно
    }
}

// по умолчанию все классы finale - не наследуемые (open - наследуемый)
open class PersonV() {

   open fun read(book:String){

    }
}

 fun main() {

     val student1 = StudentV("Ivan", 21, 1, Id(10L))
     // student1.read("")
     val student2 = StudentV ("Anna", 22, 2, Id(20L))
     val student3 = StudentV ("Lena", course = 3, id=Id(40L))
     val student4 = StudentV (course = 3, name =  "Petr", id=Id(40L) )
     // println(student2.counter)

     println(StudentV.counter)
     Singleton.test1()

 }