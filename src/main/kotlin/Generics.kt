// Книги
data class Book (
    val name: String,
//    val author: String,
    var pages: Int
)
// Журналы
data class MagazineP(
    val name: String,
 //   val author: String,
 //   var year: Int
) : Paper()

data class Magazine(
    val name: String,
    //   val author: String,
    //   var year: Int
)


open class Paper {

}
//Книжная полка
class BookShelfP <T: Paper>(val number: Int) {
    val listItems = mutableListOf<T>()

    fun <T> keepT(item: T) {
        println(item.toString())
    }
    fun keep(item: T) {
        println(item.toString())
    }
}

class BookShelf <T>(val number: Int) {
    val listItems = mutableListOf<T>()

    fun <T> keepT(item: T) {
        println(item.toString())
    }
    fun keep(item: T) {
        println(item.toString())
    }
}

inline fun <T, reified R> isGeneric(item:T, clazz: R) : Boolean = item is R

fun main() {
    //val shelf2 = BookShelf <Book> (4) // нельзя - не ребенок
    val shelf1P = BookShelfP <MagazineP> (2)
    shelf1P.keepT(MagazineP("Mag"))
    shelf1P.keepT(Book("Book", 4))
    shelf1P.keepT("String")
    shelf1P.keep(MagazineP("Mag"))
    //shelf1P.keep(Book("Book", 4))

    //val shelf2 = BookShelf <Book> (4) // нельзя - не ребенок
    val shelf1 = BookShelf <MagazineP> (2)
    shelf1.keepT(Magazine("Mag"))
    shelf1.keepT(Book("Book", 4))
    shelf1.keepT("String")
    //shelf1.keep(Magazine("Mag"))
    //shelf1.keep(Book("Book", 4))

}

fun <T> assertListAnyMatch(expectedList: List<T>, predicate: (T) -> Boolean) {

}

fun <T> stringToEntity(body:String?, type: Class<T>): T {

    TODO()
}

fun <T> stringToList(body:String, type: Class<T>): List<T> {

    TODO()
}

//fun <T> reciveMessages(count:Int, clazz: Class<T>): List<T> {
//
//    session.reciverMessages(count)
//    return listener.messages.takeLast(count).map {
//        stringToEntity(it, clazz)
//    }
//}