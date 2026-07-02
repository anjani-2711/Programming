/*
Write a program to check whether a number is prime or not*/

class Logic
{
    void checkPrime(int num)
    {
        int count = 0;   // Variable to count factors

        for(int i = 1; i <= num; i++)   // Loop from 1 to num
        {
            if(num % i == 0)            // Check if i is a factor of num
            {
                count++;                // Increase factor count
            }
        }

        if(count == 2)                  // Prime number has exactly 2 factors
        {
            System.out.println(num + " is Prime");
        }
        else
        {
            System.out.println(num + " is Not Prime");
        }
    }
}

class Program6
{
    public static void main(String args[])
    {
        Logic obj = new Logic();   // Create object of Logic class
        obj.checkPrime(11);        // Call method and pass number 11
    }
}