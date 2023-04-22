import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("_______CALCULATOR_______");
        double a, b, result;
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        a = sc.nextDouble();
        System.out.println("Enter the value of b");
        b = sc.nextDouble();
        System.out.println("Enter the operator between +, -, * , /");
        ch = sc.next().charAt(0);
        
        System.out.println("Your Answer is ");
        switch(ch){
            
        // Addition
        case '+':
        result = a+b;
        System.out.println(result);
        break;
        
        //Subtraction
        case '-':
        result = a-b;
        System.out.println(result);
        break;

        // Multiplication
        case '*':
        result = a*b;
        System.out.println(result);
        break;

        // Division
        case '/':
        result = a/b;
        System.out.println(result);
        break;

        default:
        System.out.println("You entered the incorrect values");
    }
    
}
}