import java.util.Scanner;

public class CToFConversions
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double Celsius;
        String trash = "";
        double Fahrenheit;
        double FreezPoint = 0;
        double BoilingPoints = 100;
        boolean testing = true;

        do
        {
            System.out.print("Enter your Temp in Celsius ");
            if (in.hasNextDouble()) {
                Celsius = in.nextDouble();
                in.nextLine(); //have to clear the buffer after reading a number
                System.out.println("\nYou said that you temp is " + Celsius);
                Fahrenheit = (Celsius * 9 / 5) + 32;
                System.out.println("your temp in Fahrenheit is " + Fahrenheit);
                testing = false;
            } else {
                trash = in.nextLine();
                System.out.println(trash + " is not a valid number");
            }
        }while(testing == true);
    }
}
