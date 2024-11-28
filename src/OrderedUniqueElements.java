import java.util.LinkedHashSet;
import java.util.Set;

public class OrderedUniqueElements {


    public static Set<String> getOrderedUniqueElements(String[] words) {
        Set<String> orderedUniqueElements = new LinkedHashSet<>();


        for (String word : words) {
            orderedUniqueElements.add(word);
        }

        return orderedUniqueElements;
    }

    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "cherry", "banana"};


        Set<String> result = getOrderedUniqueElements(words);


        System.out.println("Ordered unique elements: " + result);
    }
}