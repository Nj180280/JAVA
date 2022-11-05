// Print Pascal's Triangle in Java
import java.io.*;
 
class pascaltri{
    public int fact(int i)
    {
        if (i == 0)
            return 1;
        return i * fact(i - 1);
    }
    public static void main(String[] args)
    {
        int n = 4, i, j;
        pascaltri g = new pascaltri();
        for (i = 0; i <= n; i++) {
            for (j = 0; j <= n - i; j++) 
            {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print(
                    " "
                    + g.fact(i)
                          / (g.fact(i - j)
                             * g.fact(j)));
            }
            System.out.println();
        }
    }
}