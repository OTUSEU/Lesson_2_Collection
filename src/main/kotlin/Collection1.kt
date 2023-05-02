fun main() {

    val list = listOf(1, 4, 7, 9)
    // list.add(5) // нельзя, т.к. лист не изменяемый
    println(list)
    val listM = mutableListOf<Int>()
    listM.add(5) // можно т.к. mutable не смотря на val
    println(listM)
    listM+=7
    println(listM)
    listM.addAll(list)
    println(listM)
    listM.addAll(listOf(2,4,8,10))
    println(listM)
    println(list.get(3))
    println(list[3])
    listM[2] = 45
    println(listM)
    val listTM = listOf(1, 4, 7, 9).toMutableList()
    val listMMM = list.toMutableList()
    listM.removeAt(2)
    println(listM)
    listM.remove(7)
    println(listM)
    listM-=10
    println(listM)
    listM-=6
    println(listM)
    // println(listM[22]) // ошибка выход за границы массива
}