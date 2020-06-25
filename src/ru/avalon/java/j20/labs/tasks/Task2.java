package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.models.Point;

/**
 * Задание №2.
 *
 * <p>
 * Тема: "Создание обобщённых классов".
 */
public class Task2 implements Task {

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        System.out.println("Возвращает Task2");

        Point<Float> fOb;                  // Создали ссылку типа Point для веществееных чисел типа float
        fOb = new Point<>(29.5f, 58.9f);     // Создали точку, использующую для описания координат  значения типа float

        Point<Integer> iOb;       // создали ссылку типа Point для целых чисел
        iOb = new Point<>(5, 8);  // Создали точку, использующую для описания координат  значения типа int

        double distanceTo;
        distanceTo = fOb.distanceTo(iOb);
        System.out.println(distanceTo);

        /*
         * TODO(Студент): Выполнять задание №2
         *
         * 1. Выполнить обобщение класса Point с использованием
         *    шаблона так, чтобы в качестве координат точки
         *    можно было использовать любые числовые типы данных.
         *
         * 2. Создать  экземпляр типа Point:
         *
         *    - Создать точку, использующую для описания координат
         *      значения типа float.
         *
         *    - Создайте точку, использующую для описания координат
         *      значение типа int.
         *
         * 3. Вычислите дистанцию между точками.
         *
         * 4. С использованием отладчика проверьте корректность
         *    работы программы.
         */
    }
}
