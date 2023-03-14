import java.util.Scanner;

// import java.lang.math;
// import java.util;

public class Calculator {

    static double SquareRoot(double x) {
        double root;
        root = Math.sqrt(x);
        return root;
    }

    static double Factorial(double x) {
        if (x == 1) {
            return 1;
        }
        return x * Factorial(x - 1);
    }

    static double Power(double x, double y) {
        double p;
        p = Math.pow(x, y);
        return p;
    }

    static double Log(double x) {
        double l;
        l = Math.log(x);
        return l;
    }

    public static void main(String[] args) {
        // System.out.print("Calculator in JAVA\n");
        Scanner myObj = new Scanner(System.in);

        double a, b;
        int z;
    
        System.out.print("WHAT YOU WANT TO FIND: \n" );
        System.out.print("Press '1' for Square root (√x) \n");
        System.out.print("Press '2' for Factorial (x!) \n");
        System.out.print("Press '3' for Natural Logarithm (ln(x)) \n");
        System.out.print("Press '4' for Power (x^b) \n");
    
        z = myObj.nextInt();
        switch (z)
        {
        case 1:
            System.out.print("Enter the Number for Calculating Square Root \n");
            a = myObj.nextInt();
            System.out.print("Square root of " + a + " is "+ SquareRoot(a) + "\n");
            break;
           
        case 2:
            System.out.print("Enter the Number for Calculating Factorial \n");
            a = myObj.nextInt();
            System.out.print("Factorial of " + a + " is " + Factorial(a) + "\n");
            break;
    
        case 3:
            System.out.print("Enter the Number for Calculating Log \n");
            a = myObj.nextInt();
            System.out.print("Log of of " + a + " is " + Log(a) + "\n");
            break;
    
        case 4:
            System.out.print("Enter the Number for Calculating its Power: \n");
            a = myObj.nextInt();
            System.out.print("Enter the Power for a Number: \n" );
            b = myObj.nextInt();
            System.out.print(a + " to the power " + b + " is " + Power(a, b) + "\n");
            break;
           
        }
    }
}
