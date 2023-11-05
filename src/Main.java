public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] array1 = {45, 20, 300, 4, 88};
        int[] array2 = {50, 41, 600, 12};
        System.out.println(allLess(array1, array2));
    }

    public static boolean allLess(int[] array1, int[] array2) {
        boolean thing = true;
        for (int i = 0; i < array1.length; i++) {
            if ((array2[i] > array1[i] && array1.length == array2.length && thing)) {
                thing = true;
            } else {
                thing = false;
            }
        }
        return thing;
    }
}