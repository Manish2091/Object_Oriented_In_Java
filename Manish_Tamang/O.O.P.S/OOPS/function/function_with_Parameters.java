package OOPS.function;

import java.util.*;
public class function_with_Parameters {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //parameters
        int a, b;

        System.out.println("Please enter the first number");
        a = sc.nextInt();

        System.out.println("Please enter the second number");
        b = sc.nextInt();

        int result = CalculateSum(a, b);
        System.out.println("Sum = " + result);



    }
    public static int CalculateSum(int num1, int num2) {  // parameters
        int Sum = num1 + num2;
        return Sum;
    }
}






