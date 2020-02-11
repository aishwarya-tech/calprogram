package cal;
import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		
		double num1, num2;
		char ans;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter first number:");
        num1 = scanner.nextDouble();
        
        System.out.println("Enter second number:");
        num2 = scanner.nextDouble();

      do
      {
        System.out.println("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

       // scanner.close();
        double output;

        switch(operator)
        {
            case '+':
            	output = num1 + num2;
                break;

            case '-':
            	output = num1 - num2;
                break;

            case '*':
            	output = num1 * num2;
                break;

            case '/':
            	output = num1 / num2;
                break;

            default:
                System.out.println("You have entered wrong operator");
                return;
        }
        
        System.out.println("The output is: ");
        System.out.println(num1+" "+operator+" "+num2+" = "+output);
        
        System.out.println("Do you want to continue: (y or n): ");
        ans = scanner.next().charAt(0);
       // scanner.close();
      }while(ans=='Y' || ans=='y');
      scanner.close();
	}

}
