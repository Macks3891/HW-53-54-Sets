import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Класс для получения уникальных строк в порядке их появления.
 */
public class OrderedUniqueElements {

    /**
     * Метод для получения уникальных строк в порядке их появления.
     *
     * @param words Массив строк.
     * @return Множество уникальных строк в порядке их появления.
     */
    public static Set<String> getOrderedUniqueElements(String[] words) {
        Set<String> orderedUniqueElements = new LinkedHashSet<>();
        for (String word : words) {
            orderedUniqueElements.add(word);
        }
        return orderedUniqueElements;
    }
}