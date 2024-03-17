public class Main {
    public static String LargestAndSmallest(String Str, int k) {
        String Smallest = Str.substring(0, k);
        String Largest = Str.substring(0, k);

        for (int i = 1; i <= Str.length() - k; i++) {
            String CurrentString = Str.substring(i, i + k);

            if (CurrentString.compareTo(Smallest) < 0) {
                Smallest = CurrentString;
            } else if (CurrentString.compareTo(Largest) > 0) {
                Largest = CurrentString;
            }
        }

        return Smallest + "\n" + Largest;
    }

    public static void main(String[] args) {
        System.out.println(LargestAndSmallest("welcometojava", 3));
    }
}
