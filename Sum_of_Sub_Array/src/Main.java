public class Main {
    public static void subArray(int number[]) {
        int Total_Value=0;
        for (int i = 0; i < number.length; i++) {
            for (int j = i ; j <= number.length; j++) {

                for (int k = i; k < j; k++) {
                    Total_Value+=number[k];
                }

            }

        }
        System.out.println("Total Sum values is " + Total_Value);
    }

    public static void main(String[] args) {
        int number[] = {1, 2, 3, 4};
        subArray(number);
    }
}
