import java.lang.reflect.Array;
import java.util.Scanner;

public class Main{



    public  static  void main(String args[])
    {
        System.out.println("Enter the range of Array");
        Scanner sc=new Scanner(System.in);
        int range_of_Array=sc.nextInt();
        int Array[]=new int[range_of_Array];
        for (int i=0;i<Array.length;i++)
        {
            System.out.println("Enter the values...");
            Scanner input=new Scanner(System.in);
            Array[i]=input.nextInt();
        }
        for (int j=0;j<Array.length;j++)
        {
            System.out.println(Array[j]);
        }


    }

}