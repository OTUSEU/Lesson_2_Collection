fun main() {
    val diap = 1..10
    val list = (1..10).toList()
    println(list)
    val list2 = list.filter { it > 4 }
    println(list2)
    val list3 = list.filterNot { it > 4 }
    println(list3)
    val list4 = list.first { it > 4 }
    println(list4)
    val list5 = list.last { it > 4 }
    println(list5)
    val list6 = list.map {"String $it"}
    println(list6)
    val list7 = list.map {
        println("String $it")
    }
    println(list7)
    // свертка list
    val list8 = list.reduce {first, last -> first+last}
    println(list8)
    // разделение списка на 2
    val list9 = list.partition {it > 5}
    println(list9)
    println(list9.first)
    println(list9.second)
    val list10 = list.partition {it < 0}
    println(list10)
    println(list10.first)
    println(list10.second)
    val list11 = list.take(4)
    println(list11)
    val list12 = list.drop(4)
    println(list12)
    val list13 = list
        .drop(4)
        .filter {it%2 == 0}
        .map{"String $it"}
    println(list13)
    // для тяжелых списков (больших)
    val list14 = list.asSequence()
        .drop(4)
        .filter {it%2 == 0}
        .map{"String $it"}
        .toList()
    println(list14)

    // set - уникальный список без повторов
    val listset = listOf<Int>(3,5,8,3,7,8)
    val set = listset.distinct() // преобразует в set и обратно в лист
    println(listset)
    println(set)


    val map = mutableMapOf (
        1 to "one",
        2 to "to"
    )
    map+=(3 to "three")
    map.put(4,"for")
    println(map)
    map+=(1 to "ss")
    println(map)

    val list15 = (1..30).toList()
    val list16 = list15.partition { it%2 == 0 }
    val maps = list16.first.zip(list16.second)
    println(list16)
    println(maps)

    val listR = listOf(
        listOf(1,4,7,9),
        listOf(4,7,9)
    )
    println(listR)

    val avarage1 = listR.flatMap { it }
    val avarage2 = listR.flatten()
    println(avarage1)
    println(avarage2)
    println(avarage2.average())
    println(list15.indexOf(3))
}