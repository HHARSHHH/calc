import java.util.Scanner;
public class Add {
    static int a , b;
    public Add(int x, int y)
    {
        this.a = x;
        this.b = y;
    }
    //
    public int summ()
    {
        int sum;
        //Scanner myObj = new Scanner(System.in); // Create a Scanner object
        //System.out.println("Type a number:");
        // a = myObj.nextInt(); // Read user input

        //System.out.println("Type another number:");
        //b = myObj.nextInt(); // Read user input

        sum = a + b -1;  // Calculate the sum of x + y
        System.out.println("Sum is: " + sum); // Print the sum
        return sum;
    }
    public static void main(String[] args) {

    }
}
