
public class Main
{
    public static void main(String[] args)
    {
        int countOne;
        for ( countOne = 10; countOne > -1; countOne = countOne - 2)
        {
            System.out.println(countOne);
        }

        String star = "*";

        for (int x = 1; x<=5; x++)
        {
            for (int y = 1; y <= x; y++)
            {
                System.out.print(star);
            }
            System.out.println();
        }

        for (int x = 1; x<=5; x++)
        {
            for (int y = 5; y >= x; y--)
            {
                System.out.print(star);
            }
            System.out.println();
        }


        for (int x = 1; x<=5; x++)
        {
            for (int y = 5; y >= 1; y--)
            {
                System.out.print(star);
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++)//controls your y axis
        {
            for (int j = 1; j <= 5; j++) //controls your x axis
            {
                if (i==1 || i==3 || i==5 || i==2 && j==1 || i==4 && j==5)// these are like corrdinetes on a grid
                {
                System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
/*
        for (int i = 1; i <= n; i++)//controls your y axis
        {
            for (int j = 1; j <= n; j++) //controls your x axis
            {
                if (i==1 || i==3 || j==1 || j==5)// these are like corrdinetes on a grid
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++)//controls your y axis
        {
            for (int j = 1; j <= n; j++) //controls your x axis
            {
                if (j==1 || j==5 || i==2 && j==2 || i==2 && j==4 || i==3 && j==3)// these are like corrdinetes on a grid
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

 */
        for (int x = 1; x <= 1; x++)
        {
            for (int y = 1; y <= 5; y++)
            {
                System.out.print("*");
            }
            System.out.println();
            for (int y = 1; y <= 1; y++)
            {
                System.out.print("*");
            }
            System.out.println();
            for (int y = 1; y <= 5; y++)
            {
                System.out.print("*");
            }
            System.out.println();
            for (int y = 1; y <= 1; y++)
            {
                System.out.print("    *");
            }
            System.out.println();
            for (int y = 1; y <= 5; y++)
            {
                System.out.print("*");
            }
            System.out.println();

        }


    }
}