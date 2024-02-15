//it is to import scanner class so that java can take inputs from user and scan it
import java.util.Scanner;

//here class is calculator as my file name is calculator.java
public class calculator {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        // take input from user till user do not press f
        System.out.println("Press 'f' to finish calculations");
        int ans = 0;
        while (true) {
            System.out.print("Enter the operator = ");
            char op = in.next().trim().charAt(0);
            System.out.println();
            if (op == '+' || op == '-' || op == '*' || op == '/') {
                //input taken from users
                System.out.print("Enter 1st number = ");
                int num1 = in.nextInt();// input to eter 1st number
                System.out.print("Enter 2nd number = ");
                int num2 = in.nextInt();// input to enter 2nd number
            //operators has been started
                if (op == '+') // additional operator
                {
                    ans = num1 + num2;
                }
                if (op == '*') //multiplication operator
                {
                    ans = num1 * num2;
                }
                if (op == '-') //subtraction operator
                {
                    ans = num1 - num2;
                }
                if (op == '%') //modulus operator
                {
                    ans = num1%num2;  
                }
                if (op == '/') //devision operator
                {
                    if (num2 != 0) // it is used so that the answer shpooul not be infinite
                    {
                        ans = num1 / num2;
                    }
                }
            } 
            //to break the loop when we press any particular key here we taken it as f
            else if (op == 'f') 
            {
                break;

            } 
            else //any other entry will be resulted as invalid entry
            {
                System.out.println("Invalid result");
            }

            System.err.println(ans);
        }

    }
}
