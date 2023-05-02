// в дата класс переопределены toString, hascode, equals для конструктора
data class StudentE(
    val name: String,
    var age: Int = 19,
    val course: Int,
    val id: IdE = IdE(10L),
    val faculty: Faculty
) {

val number: String get() = "Student $name"
companion object {
    // Количество студентов
    var counter: Int = 0
    }
    init {
        counter++
    }
}

@JvmInline
value class IdE(val id:Long) {
    init {

    }
}
// abstract по умолчанию open
abstract class SchoolerE {
    // переопределять необязательно
    fun read() {

    }
    // переопределять обязательно
    abstract fun write()
}
// В Kotlin и Java наследование только от одного класса, но много:
interface LearnE {

    fun study() {
        // Здесь можно задать тело по умолчанию, тогда override - не обязательно
    }
}

// по умолчанию все классы finale - не наследуемые (open - наследуемый)
open class PersonE() {

   open fun read(book:String){

    }
}

 fun main() {

     val student1 = StudentE("Ivan", 21, 1, IdE(10L), Faculty.FIT)
     // student1.read("")
     val student2 = StudentE ("Anna", 22, 2, IdE(20L), Faculty.BIO)
     val student3 = StudentE ("Lena", course = 3, id=IdE(40L), faculty = Faculty.FTF )
     val student4 = StudentE(course = 3, name =  "Petr", id=IdE(40L), faculty = Faculty.FTF )
     // println(student2.counter)

     println(StudentE.counter)
     Singleton.test1()
     println(student1.faculty.students)
     println(Faculty.valueOf("BIO"))
     println(Faculty.valueOf("BIO").students)
     //println(Faculty.valueOf("FRR").students) // Error No enum constant Faculty.FRR
     println(student1)

 }