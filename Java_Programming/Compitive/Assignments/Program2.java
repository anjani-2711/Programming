/*
Write a program to check whether a number is a palindrome or not*/
class Logic
{
    void checkPalindrome(int num)
    {
        int original = num;
        int digit = 0;
        int reverse = 0;

        while(num != 0)
        {
            digit = num % 10;
            reverse = (reverse * 10) + digit;
            num = num / 10;
        }

        if(original == reverse)
        {
            System.out.println("Palindrome Number");
        }
        else
        {
            System.out.println("Not a Palindrome Number");
        }
    }
}

class Program2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkPalindrome(221);
    }
}