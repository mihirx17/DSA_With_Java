public class Main {
    public static void subArray(int number[]) {
        int max_Sub_Value = Integer.MIN_VALUE;
        int current = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j <= number.length; j++) {
                current = 0;
                for (int k = i; k < j; k++) {
                    current += number[k];
                }
                if (max_Sub_Value < current) {
                    max_Sub_Value = current;
                }
            }
        }
        System.out.println("Max Sub Array values"+ max_Sub_Value);
    }

    public static void main(String[] args) {
        int number[] = {1, 2, 3, 4};
        subArray(number);
    }
}
