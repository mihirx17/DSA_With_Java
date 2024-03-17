
public class Main {
    public static void main(String[] args) {
        int Array[]={1,34,10,45,56,67,775,};
        int Max_Array=Array[0];
        int min_Array=Array[0];
        for (int i=1;i<Array.length;i++)
        {
            if(Max_Array<Array[i])
            {
                Max_Array=Array[i];
            }
            if(min_Array>Array[i])
            {
                min_Array=Array[i];
            }
        }
        System.out.println("Max_Values  " + Max_Array);
        System.out.println("Min_Values " + min_Array);


        }
    }
