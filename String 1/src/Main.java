
public class Main {
    public static void PrintString(String str)
    {
        for (int i=0;i<str.length();i++){
            System.out.print(str.charAt(i) + " ");
        }
    }
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");

String First_Name="Mihir";
String Second_Name="Gupta";
String Full_Name=First_Name +Second_Name;
PrintString(Full_Name);
        }
    }
