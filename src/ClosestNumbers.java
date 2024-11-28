/**
 * Класс для поиска ближайших меньшего и большего элементов в массиве целых чисел.
 */
public class ClosestNumbers {

    /**
     * Метод для поиска ближайших меньшего и большего элементов в массиве целых чисел.
     *
     * @param numbers Массив целых чисел.
     * @param target  Целевое число.
     * @return Массив из двух элементов: ближайший меньший и ближайший больший элементы.
     */
    public static int[] findClosestNumbers(int[] numbers, int target) {
        int closestSmaller = Integer.MIN_VALUE;
        int closestLarger = Integer.MAX_VALUE;

        for (int number : numbers) {
            if (number < target && number > closestSmaller) {
                closestSmaller = number;
            } else if (number > target && number < closestLarger) {
                closestLarger = number;
            }
        }

        return new int[]{closestSmaller, closestLarger};
    }
}