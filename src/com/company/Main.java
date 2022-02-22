package com.company;

public class Main
{

    public static void main(String[] args)
    {
	int num1 = 0;
    int num2 = 0;
    if (num1 != 0 || num2 != 0)
        {
        System.out.print("One of the inputs is not a number, please try again.");
        }
    else if (num1 == num2)
        {
        System.out.println("The first number and the second number are equal.");
        }
    else if (num1 > num2)
        {
        System.out.println("The first number is greater than the second number.");
        }
    else
        {
        System.out.print("The first number is less than the second number.");
        }
    }
}
