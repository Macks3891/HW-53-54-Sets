import java.util.Set;

/**
 * Основной класс для демонстрации использования методов из других классов.
 */
public class Main {
    /**
     * Основной метод программы.
     *
     * @param args Аргументы командной строки.
     */
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 2, 1, 4};
        Set<Integer> uniqueElements = UniqueElements.getUniqueElements(numbers);
        System.out.println("Unique elements: " + uniqueElements);


        String[] words = {"apple", "banana", "apple", "cherry", "banana"};
        Set<String> orderedUniqueElements = OrderedUniqueElements.getOrderedUniqueElements(words);
        System.out.println("Ordered unique elements: " + orderedUniqueElements);


        int[] numbersForClosest = {10, 20, 30, 40, 50};
        int target = 35;
        int[] closestNumbers = ClosestNumbers.findClosestNumbers(numbersForClosest, target);
        System.out.println("Closest smaller: " + closestNumbers[0]);
        System.out.println("Closest larger: " + closestNumbers[1]);
    }
}