/*
Write a program to check whether a number 
is positive,negative or zero*/
class Logic
{
    void checkSign(int num)
    {
        if(num > 0)                    // Check for positive number
        {
            System.out.println("Positive Number");
        }
        else if(num < 0)               // Check for negative number
        {
            System.out.println("Negative Number");
        }
        else                           // If number is neither positive nor negative
        {
            System.out.println("Zero");
        }
    }
}

class Program10
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkSign(-8);
    }
}