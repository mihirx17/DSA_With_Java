// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        StringBuilder Str= new StringBuilder("");
        for (char ch='A';ch<'Z';ch++)

        {
            Str.append(ch);
        }
        Integer I=12;
        String NewInt=I.toString();
        System.out.println(NewInt);
        System.out.println(Str);
        System.out.println(Str.length());
        System.out.println(Str.substring(1,7));
        System.out.println(Str.subSequence(1,3));
    }
}