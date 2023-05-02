
//data class Student(val name: String, var age: Int) : Person()
// class Student : Person, Learn{
//class Student : Schooler, Learn{
/*class Student {

     val name: String
     var age: Int

     companion object {
         // Количество студентов
         var counter: Int = 0
     }


     constructor( name: String, age: Int) {
         this.name = name
         this.age = age
         counter++
     }
    //override
   /*
    fun read(book: String) {

    }

    override fun write() {
        TODO("Not yet implemented")
    }
        override fun study() {
            TODO("Not yet implemented")
        }
     */
}
*/

data class Student(val name: String, var age: Int = 19, val course: Int) {

companion object {
    // Количество студентов
    var counter: Int = 0
    }
    init {
        counter++
    }
}
// abstract по умолчанию open
abstract class Schooler {
    // переопределять необязательно
    fun read() {

    }
    // переопределять обязательно
    abstract fun write()
}
// В Kotlin и Java наследование только от одного класса, но много:
interface Learn {

    fun study() {
        // Здесь можно задать тело по умолчанию, тогда override - не обязательно
    }
}

// по умолчанию все классы finale - не наследуемые (open - наследуемый)
open class Person() {

   open fun read(book:String){

    }
}

 fun main() {

     val student1 = Student("Ivan", 21, 1)
     // student1.read("")
     val student2 = Student ("Anna", 22, 2)
     val student3 = Student ("Lena", course = 3)
     val student4 = Student (course = 3, name =  "Petr" )
     // println(student2.counter)

     println(Student.counter)
     Singleton.test1()

 }