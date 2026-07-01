/*
Write a program to print the multiplication table of a number*/
class Logic
{
    void printTable(int num)
    {
        int i = 0;

        for(i = 1; i <= 10; i++)
        {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}

class Program5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printTable(5);
    }
}