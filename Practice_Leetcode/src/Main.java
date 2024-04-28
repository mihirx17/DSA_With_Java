// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static boolean Palidrome(int x) {
        if (x < 0) {
            return false;
        }
        int orginal = x;
        int reverse = 0;
        while (x != 0) {
            reverse = reverse * 10 + x % 10;
            x = x / 10;
        }
        if(reverse==orginal)
        {
            return  true;
        }
        return false;
    }



        public static void main (String[]args){
            System.out.println( Palidrome(143));

        }
    }
