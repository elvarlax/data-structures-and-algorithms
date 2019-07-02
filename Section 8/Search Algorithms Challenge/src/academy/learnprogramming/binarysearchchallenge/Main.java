package academy.learnprogramming.binarysearchchallenge;

public class Main {

    public static void main(String[] args) {
        /*
        Use the iterativeBinarySearch function to create recursiveBinarySearch function.
        Hint: You have to use a helper function.
        */
        int[] intArray = {-22, -15, 1, 7, 20, 35, 55};

        System.out.println(iterativeBinarySearch(intArray, -15));
        System.out.println(iterativeBinarySearch(intArray, 35));
        System.out.println(iterativeBinarySearch(intArray, 8888));
        System.out.println(iterativeBinarySearch(intArray, 1));
        System.out.println("============");
        System.out.println(recursiveBinarySearch(intArray, -15));
        System.out.println(recursiveBinarySearch(intArray, 35));
        System.out.println(recursiveBinarySearch(intArray, 8888));
        System.out.println(recursiveBinarySearch(intArray, 1));
    }

    public static int iterativeBinarySearch(int[] input, int value) {
        int start = 0;
        int end = input.length;

        while (start < end) {
            int mid = (start + end) / 2;
            System.out.println("mid = " + mid);
            if (input[mid] == value) {
                return mid;
            } else if (input[mid] < value) {
                // right
                start = mid + 1;
            } else {
                // left
                end = mid;
            }
        }

        return -1;
    }

    public static int recursiveBinarySearch(int[] input, int value) {
        return recursiveBinarySearch(input, 0, input.length, value);
    }

    public static int recursiveBinarySearch(int[] input, int start, int end, int value) {
        if (start >= end) {
            return -1;
        }

        int mid = (start + end) / 2;
        System.out.println("mid = " + mid);

        if (input[mid] == value) {
            return mid;
        } else if (input[mid] < value) {
            // right
            return recursiveBinarySearch(input, mid + 1, end, value);
        } else {
            // left
            return recursiveBinarySearch(input, start, mid, value);
        }
    }
}
