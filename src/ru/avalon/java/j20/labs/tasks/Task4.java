package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.models.Person;

/**
 * Задание №4.
 *
 * <p>Тема: "Методы класса {@link Object}".
 */
public class Task4 implements Task {

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
       System.out.println("Возвращает Task4");

        Person a = new Person("Иван", "Иванов");
        Person b = new Person("Иван", "Иванов");
       /**
         * хеш-код — это число (битовая строка) фиксированной длины,
         * полученная из массива произвольной длины
         */
        int hCodeA;
        hCodeA = a.hashCode();
        System.out.println(hCodeA);

        int hCodeB;
        hCodeB = b.hashCode();
        System.out.println(hCodeB);

// В результате выполнения программы в консоль выводятся разные целые 10-ти значные числа. 
// Это число и есть наши битовые строки фиксированной длины. 
        /**
         * каждый вызов оператора new порождает новый объект в памяти. 
         * метод equals() существует для проверки эквивалентности в классе Object,
         * который сравнивает содержимое объектов и выводит значение типа boolean true,
         * если содержимое эквивалентно, и false — если нет.
         */
boolean isEqual = a.equals(b);
        
        System.out.println(isEqual);
// В результате выполнения программы наблюдаем значение "false", что говорит о том, в чем мы убедились 
// ранее что битовые строки не равны
        
        /*
         * TODO(Студент): Выполните задание №4
         *
         * 1. С использованием отладчика проверьте, что
         *    сравнение объектов класса Person выполняется
         *    некорректно.
         *
         * 2. Переопределите в классе Person методы equals и
         *    hashCode.
         *
         * 3. С использованием отладчика проверьте что сравнение
         *    объектов типа Person выполняется корректно.
         */
    }
}
