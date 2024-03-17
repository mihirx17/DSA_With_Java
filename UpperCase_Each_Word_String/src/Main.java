// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static String UpperCase_EachWord(String Str)
    {
        StringBuilder sb=new StringBuilder(" ");
        char ch=Character.toUpperCase(Str.charAt(0));
        sb.append(ch);
        for (int i=0;i<Str.length();i++)
        {
            if(Str.charAt(i)==' ' && i< Str.length()-1)
            {
                sb.append(Str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(Str.charAt(i)));

            }
            else
            {
                sb.append(Str.charAt(i));
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {

        String Str="hii i am Mihir  gupta";
        System.out.println(UpperCase_EachWord(Str));


    }
}