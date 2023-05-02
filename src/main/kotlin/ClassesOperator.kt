// в дата класс переопределены toString, hascode, equals для конструктора
data class StudentO(
    val name: String,
    var age: Int = 19,
    var course: Int,
    val id: IdE = IdE(10L),
    var faculty: Faculty,
    var hasHotel: Boolean = false
) {

companion object {
    // Количество студентов
    var counter: Int = 0
    }
    init {
        counter++
    }

    operator fun plus(number: Int) {
        this.course = this.course+number
    }

    operator fun unaryMinus() {
        when (this.hasHotel) {
            true ->this.hasHotel = false
            false ->this.hasHotel = true
        }
    }

        infix fun moveToFaculty(newFaculty: Faculty) {
            this.faculty = newFaculty
        }
}


@JvmInline
value class IdO(val id:Long) {
    init {

    }
}
// abstract по умолчанию open
abstract class SchoolerO {
    // переопределять необязательно
    fun read() {

    }
    // переопределять обязательно
    abstract fun write()
}
// В Kotlin и Java наследование только от одного класса, но много:
interface LearnO {

    fun study() {
        // Здесь можно задать тело по умолчанию, тогда override - не обязательно
    }
}

// по умолчанию все классы finale - не наследуемые (open - наследуемый)
open class PersonO() {

   open fun read(book:String){

    }
}

 fun main() {

     val student1 = StudentO("Ivan", 21, 1, IdE(10L), Faculty.FIT)
     // student1.read("")
     val student2 = StudentO ("Anna", 22, 2, IdE(20L), Faculty.BIO)
     val student3 = StudentO ("Lena", course = 3, id=IdE(40L), faculty = Faculty.FTF )
     val student4 = StudentO(course = 3, name =  "Petr", id=IdE(40L), faculty = Faculty.FTF )
     // println(student2.counter)

     println(StudentO.counter)
     Singleton.test1()
     println(student1.faculty.students)
     println(Faculty.valueOf("BIO"))
     println(Faculty.valueOf("BIO").students)
     println(student1)

     // переопределенная функция+
     student1+3
     println(student1.course)
     -student1
     println(student1.hasHotel)
     student1 moveToFaculty Faculty.BIO
     println(student1.faculty)

 }