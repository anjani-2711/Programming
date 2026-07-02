/*
Write a program to print all odd numbers up to N*/
class Logic
{
    void printOddNumbers(int n)
    {
        for(int i = 1; i <= n; i = i + 2)   // Start from 1 and increase by 2
        {
            System.out.println(i);          // Print odd number
        }
    }
}

class Program
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printOddNumbers(20);
    }
}