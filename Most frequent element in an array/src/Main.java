import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int Array[] = {3, 3, 45, 5, 45, 3, 24, 55};
        int mostFrequentNumber = 0;
        int maxCount = 0;

        for (int i = 0; i < Array.length; i++) {
            int count = 0;
            for (int j = 0; j < Array.length; j++) {
                if (Array[i] == Array[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mostFrequentNumber = Array[i];
            }
        }

        System.out.println("Most frequent number: " + mostFrequentNumber);
    }
}
