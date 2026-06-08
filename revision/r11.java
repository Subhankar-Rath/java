public class r11 {

    public static int[] arrayC(int num[]) {
        int start = 0;
        int end = num.length - 1;

        while(start < end) {
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;

            start++;
            end--;
        }

        return num;
    }

    public static void main(String[] args) {

        int num[] = {1, 2, 3, 4, 5};

        int[] result = arrayC(num);

        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}