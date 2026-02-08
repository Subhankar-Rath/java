public class LargestIndex {

    public static int largestNo(int number[]) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {
            if (number[i] > largest) {   // FIXED
                largest = number[i];
            }
        }
        return largest;   // FIXED
    }

    public static void main(String[] args) {
        int number[] = {1, 2, 3, 4, 5};
        System.out.println("Largest = " + largestNo(number));
    }
}
