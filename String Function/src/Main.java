// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public  static String SubString(String str,int Starting_index,int Ending_Index)
    {
      String Substring="";
      for(int i=Starting_index;i<Ending_Index;i++)
        {
            Substring+=str.charAt(i);

        }
      return Substring;
    }
    public static void main(String[] args) {
String NewSubString=SubString("Mihir",0,4);
        System.out.println(NewSubString);
        ////// by Using In build Function
        String StringFunction="MihirGUpta";
        System.out.println(StringFunction.substring(0,3));
    }
}