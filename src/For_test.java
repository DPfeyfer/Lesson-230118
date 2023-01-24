public class For_test {
    public static void main(String[] args) {
        int[] numbers = {90, 92, 93, 98, 94, 97, 0, 0, 0};
        int[] numbersCopy = {11, 22, 33, 44, 55, 66, 0, 0, 0};

        boolean arraysAreEqual = true;
        arraysAreEqual = numbers.length == numbersCopy.length;
        if (arraysAreEqual) {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] != numbersCopy[i]) {
                    arraysAreEqual = false;
                }
            }
        }
        if (arraysAreEqual) {
            System.out.println("arrays are the same");
        } else {
            System.out.println("arrays are not the same");
        }
        System.out.println();
        int maxWeight = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxWeight) {
                maxWeight = numbers[i];
            }
        }
        System.out.println(maxWeight);
        System.out.println();

        for (int i = 0; i < numbers.length - 1 && numbers[i + 1] != 0; i++) {
            System.out.println(numbers[i + 1] - numbers[i]);
        }
    }
}
