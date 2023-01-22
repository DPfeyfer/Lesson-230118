public class Main {
    public static void main(String[] args) { Task_1(); Task_2(); Task_3(); Task_4();
    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void Task_1() {
        System.out.println("Task 1");
        int[] arrays = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arrays.length; i++) {
            sum = arrays[i] + sum;
        }
        System.out.println("Monthly spending was " + sum + " RUB");
        System.out.println();
    }

    public static void Task_2() {
        System.out.println("Task 2");
        int[] arrays = generateRandomArray();
        int summa = - 1;
        int summa1 = 1000000000;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] > summa) {
                summa = arrays[i];
            }
        }
        System.out.println("MAX summa by day is " + summa + " RUB");
        System.out.println();

        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] < summa1) {
                summa1 = arrays[i];
            }
        }
        System.out.println("MIN summa by day is " + summa1 + " RUB");
        System.out.println();

    }

    public static void Task_3() {
        System.out.println("Task 3");

        System.out.println();

    }

    public static void Task_4() {
        System.out.println("Task 4");
        System.out.println();

    }
}