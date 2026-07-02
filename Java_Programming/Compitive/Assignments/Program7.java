/*
Write a program to print all even numbers up to N*/

class Logic
{
    void printEvenNumbers(int n)
    {
        for(int i = 2; i <= n; i = i + 2)   // Start from 2 and increase by 2
        {
            System.out.println(i);          // Print even number
        }
    }
}

class Program7
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printEvenNumbers(20);
    }
}