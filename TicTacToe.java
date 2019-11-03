import java.io.*;
import java.lang.*;
import java.util.*;

public class TicTacToe
{
    public static void main(String[] args)throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        char T[][] = new char[3][3];
        String s;
        char ch;
        int i, j, x, y;
        do{
            System.out.print("Choose either \"O\"(for odd) or \"X\"(for even): " );
            s = br.readLine();
            s.toUpperCase();
            ch = s.charAt(0);
            switch(ch)
            {
                case 'O':
                    System.out.print("Pos: ");
                    x = Integer.parseInt(br.readLine());
                    y = Integer.parseInt(br.readLine());
                    T[x][y]=ch;
                    break;
                case 'X':
                    System.out.print("Pos: ");
                    x = Integer.parseInt(br.readLine());
                    y = Integer.parseInt(br.readLine());
                    T[x][y]=ch;
                    break;
                default:
                    System.out.println("The result: ");
                    for (i=0; i<3; i++)
                    {
                        for (j=0; j<3; j++)
                        {
                            System.out.print(T[i][j]);
                        }
                        System.out.println();
                    }
                    System.exit(0);
                    break;
            }
            
        }while(!s.equals("X")||!s.equals("Y"));
    }
}
