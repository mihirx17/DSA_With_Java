// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

      String Str1="Mihir";
      String Str2="Mihir";
      String str3=new String("Mihir");
      if(Str1==Str2)///here ist point to same point at heap
      {
          System.out.println("It is equal ");
      }
      else {
          System.out.println("it is not equal");
      }
      if(str3==Str1)///Here its pointing to different location(at heap)
      {
          System.out.println("it is equal ");
      }
      else
      {
          System.out.println("it is not equal");
      }
      if(Str1.equals(str3))
      {
          System.out.println("It is equal");
      }
      else {
          System.out.println("it is not equal....");
      }
        }

    }
