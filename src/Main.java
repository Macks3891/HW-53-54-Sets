import java.util.Set;

public class Main {
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