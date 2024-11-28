import java.util.HashSet;
import java.util.Set;

/**
 * Класс для получения уникальных элементов из массива целых чисел.
 */
public class UniqueElements {

    /**
     * Метод для получения уникальных элементов из массива целых чисел.
     *
     * @param numbers Массив целых чисел.
     * @return Множество уникальных элементов.
     */
    public static Set<Integer> getUniqueElements(int[] numbers) {
        Set<Integer> uniqueElements = new HashSet<>();
        for (int number : numbers) {
            uniqueElements.add(number);
        }
        return uniqueElements;
    }
}