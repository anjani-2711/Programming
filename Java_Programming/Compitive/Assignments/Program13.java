/*
Write a program to check whether a number 
is divisible by 5 and 11 or not */
class Logic
{
    void checkDivisible(int num)        // Method to check divisibility
    {
        // Check if number is divisible by both 5 and 11
        if((num % 5 == 0) && (num % 11 == 0))
        {
            System.out.println(num + " is divisible by 5 and 11");
        }
        else
        {
            System.out.println(num + " is not divisible by 5 and 11");
        }
    }
}

class Program13
{
    public static void main(String args[])
    {
        Logic obj = new Logic();        // Create object of Logic class
        obj.checkDivisible(55);         // Call method and pass number
    }
}