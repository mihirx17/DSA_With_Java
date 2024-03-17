// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static float Shortest_Path(String Path)
    {
        int x=0;
        int y = 0;
        int Length_String=Path.length();
        for(int i=0;i<Length_String;i++)
        {
            char ch=Path.charAt(i);
            if(ch=='N')
            {
                y++;
            } else if (ch=='S') {
                y--;

            } else if (ch=='W') {

                x++;
            }
            else
            {
                x--;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float) Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {




String Path="NWSNNWNSENSESNWNSNNWNS";
        System.out.println(Shortest_Path(Path));
        }
    }
