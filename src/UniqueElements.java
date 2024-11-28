import java.util.HashSet;
import java.util.Set;

public class UniqueElements {


    public static Set<Integer> getUniqueElements(int[] numbers) {
        Set<Integer> uniqueElements = new HashSet<>();


        for (int number : numbers) {
            uniqueElements.add(number);
        }

        return uniqueElements;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 1, 4};


        Set<Integer> result = getUniqueElements(numbers);


        System.out.println("Unique elements: " + result);
    }
}