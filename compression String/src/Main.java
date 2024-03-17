// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static String Compression(String Str)
    {
       String NewString=" ";
       Integer Count=1;
       for(int i=0;i<Str.length();i++)
       {
           while (i<Str.length()-1&& Str.charAt(i)==Str.charAt(i+1))
           {
               i++;
               Count++;
           }
           NewString+=Str.charAt(i);
           if(Count>1)
           {
               NewString+=Count.toString();
           }
       }
       return NewString;
    }
    public static void main(String[] args) {
        String Word="aaa";
        System.out.println(Compression(Word));
        }
    }
