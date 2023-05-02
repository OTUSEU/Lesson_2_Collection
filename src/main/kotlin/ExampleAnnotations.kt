// Такой механизм при запуске тестов удобнее чем Tag
// т.к. при запуске тестов не надо определять Tag
// будут запускаться нужные тесты сами в зависимости от конфы
// что-то типа release debug, которые сами определяем

@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class EnabledForExtertnalServises