package simpleCalculator;
import java.util.*;

public class CalculatorTest{
    public static void main(String[] args) {
        double a;
        double b;
        char o;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a: ");
        a = input.nextDouble();

        System.out.println("Enter b: ");
        b = input.nextDouble();

        System.out.println("Enter Operation (+ | - | * | /): ");
        o = input.next(".").charAt(0);

        switch(o){
            case '+':
                System.out.println(a + b);
                break;

            case '-':
                System.out.println(a - b);
                break;

            case '*':
                System.out.println(a * b);
                break;

            case '/':
                double d = a / b;
                System.out.println(d);
                break;

//          case '%':
//              System.out.println(a % b);
//              break;

            default:
                System.out.println("Enter a valid calculation!");
        }


        input.close();
    }
}