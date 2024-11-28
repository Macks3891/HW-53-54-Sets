public class ClosestNumbers {


    public static int[] findClosestNumbers(int[] numbers, int target) {
        int[] result = new int[2];
        int closestSmaller = Integer.MIN_VALUE;
        int closestLarger = Integer.MAX_VALUE;

        for (int number : numbers) {
            if (number < target && number > closestSmaller) {
                closestSmaller = number;
            } else if (number > target && number < closestLarger) {
                closestLarger = number;
            }
        }

        result[0] = closestSmaller;
        result[1] = closestLarger;

        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 35;


        int[] result = findClosestNumbers(numbers, target);


        System.out.println("Closest smaller: " + result[0]);
        System.out.println("Closest larger: " + result[1]);
    }
}