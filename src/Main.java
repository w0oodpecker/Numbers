/*адача 1: Работа с числами
Описание
Работа с коллекциями является обычной задачей в программировании. Такие операции как сортировка, фильтрация, перебор встречаются в каждом проекте. Работа с коллекциями в Java значительно упростилась с появлением Stream API. Давайте сравним два подхода!

Составьте ArrayList из набора чисел 1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4 и произведите над ним следующие действия:

Отфильтруйте положительные числа.
Найдите среди этих положительных чисел четные.
Отсортируйте отфильтрованные числа в порядке возрастания.
Выведите результат на экран.
Реализация
Реализуйте два класса Main и StreamMain, в каждом из которых в функции main() составьте ArrayList из приведенных выше чисел и произведите над ними указанные операции, причем:

в первом классе выполнените работу без Stream API, используйте коллекции
во втором классе используйте стримы из библиотеки Stream API.
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        ArrayList<Integer> tmpList = new ArrayList<>();
        tmpList.addAll(intList); //Скопируем в ArrayList, а то массив не дает удалить элементы
        Comparator<Integer> comparator = (o1, o2) -> (o1 < o2) ? -1 : ((o1 == o2) ? 0 : 1);
        //Фильтрация положительных числе
        tmpList.removeIf(value -> value < 0);
        //Фильтрация четных чисел
        tmpList.removeIf(value -> (value % 2) != 0 | value == 0);
        //Сортировка по возрастанию
        tmpList.sort(comparator);
        tmpList.forEach(System.out::println);
    }
}