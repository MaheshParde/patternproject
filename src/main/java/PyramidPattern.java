public class PyramidPattern {
    public static void main(String args[])
    {
        int i, j, k = 6;
        for (i=0; i<k; i++)
        {
            for (j=k-i; j>1; j--)
            {
                System.out.print(" ");
            }
            //inner loop for columns
            for (j=0; j<=i; j++ )
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

