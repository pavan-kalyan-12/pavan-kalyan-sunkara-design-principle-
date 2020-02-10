package com.pavan.calculator;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first operand:");
        float first = scan.nextFloat();
        System.out.println("Enter the Second operand:");
        float second = scan.nextFloat();
        System.out.println("Enter the operation you wish to do:");
        String operand = scan.next();
        if(operand.equals("+")){
            Addition add = new Addition(first, second);
            System.out.println(add.addtwonumbers(first, second));
        }
        else if(operand.equals("-")){
            Subtraction sub = new Subtraction(first, second);
            System.out.println(sub.subtwonumbers(first,second));
        }
        else if(operand.equals("*")){
            Multiplication mul = new Multiplication(first, second);
            System.out.println(mul.multwonumbers(first, second));
        }
        else if(operand.equals("/")){
            Division div = new Division(first, second);
            System.out.println(div.dividetwonumbers(first, second));
        }
        else{
            System.out.println("No such option is available in our calculator");
        }
    }
}
