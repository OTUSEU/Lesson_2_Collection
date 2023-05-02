
// sealed class - Запечатанные классы
// применяется возможность ограничить количество возможных подклассов
// Все подклассы должны быть определены внутри sealed class
// Это такой Enum, но для классов
// Например в АПИ возвращается только один из трех вариантов
sealed class Result {

    class Loading(): Result()
    class Data(val data: String): Result()
    class Error(val exc: Exception): Result()
}
// Теперь можно прописать проверки, что ожидаем только один из трех вариантов

fun api() : Result {
    return Result.Data("Ответ")
}

fun check() {
    when(api()) {
        Result.Loading() -> println("Грузим")
        Result.Data("Ответ") -> println("Есть ответ")
        Result.Error(Exception()) -> println("Ошибка")
        else -> println("Не учтено")
    }
}