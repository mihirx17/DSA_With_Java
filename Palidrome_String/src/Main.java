// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void StringPalindrome(String Str) {
        int Length_String=Str.length();
        int Flag=0;
for (int i=0;i<Str.length()/2;i++)
{
    ///RACECAR
    if(Str.charAt(i)==Str.charAt(Length_String-1-i)) {


        Flag=1;
    }


}
if(Flag==1)
{
    System.out.println("IT is Palindrome...");
}
else {
    System.out.println("IT is not Palindrome...");
}
    }

    public static void main(String[] args) {
String Word="RACECAR1";
StringPalindrome(Word);
    }
}