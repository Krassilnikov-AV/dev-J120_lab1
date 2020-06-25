package ru.avalon.java.j20.labs.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.core.RandomArrayFactory;

import java.util.List;
import java.util.Set;

/**
 * Задание №5.
 *
 * <p>
 * Тема: "Изучение отличия между списками и наборами".
 */
public class Task5 implements Task {

    /**
     * Фабрика, генерирующая массивы чисел случайного характера.
     */
    private final RandomArrayFactory arrayFactory = new RandomArrayFactory();

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        System.out.println("Возвращает Task5");
        
        final int[] array = arrayFactory.getInstance(20);
  // выведим сгенерированный массив для визуализации и дальнейшего наблюдения 
        System.out.println("массив array: " + Arrays.toString(array));
        /**
         * Класс ArrayList представляет обобщенную коллекцию, которая наследует
         * свою функциональность от класса AbstractList и применяет интерфейс
         * List. Проще говоря, ArrayList представляет простой список,
         * аналогичный массиву, за тем исключением, что количество элементов в
         * нем не фиксировано.
         */
        List<Integer> list = new ArrayList<>();
        // пройдемся по сгенерированному ранее массиву
        // вложим каждый элемент массива в обобщенную коллекцию
        // выведим в консоль результат
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        System.out.println("массив list: " + list);
         /**
         * Интерфейс Set расширяет интерфейс Collection и представляет набор
         * уникальных элементов. Set не добавляет новых методов, только вносит
         * изменения унаследованные. В частности, метод add() добавляет элемент
         * в коллекцию и возвращает true, если в коллекции еще нет такого
         * элемента.
         */

        Set<Integer> set = new HashSet<>(array.length);
        // пройдемся по сгенерированному ранее массиву
        // вложим каждый элемент массива в обобщенную коллекцию
        // выведим в консоль результат, который покажет результат в виде не повторяющихся 
        // выведенных ранее значений
        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }
        System.out.println("массив set: " + set);

        /**
         * TODO(Студент): Выполните задание №5
         *
         * 1. Проинициализируйте переменные list и set объектами подходящих
         * классов.
         *
         * 2. В обе коллекции поместите элементы массива array.
         *
         * 3. С использованием отладчика проверьте корректность выполнения
         * задания.
         */
    }
}
